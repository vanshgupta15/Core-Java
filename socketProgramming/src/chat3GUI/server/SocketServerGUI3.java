package chat3GUI.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.*;

public class SocketServerGUI3 extends JFrame {

    private JTextArea messageArea;
    private JTextField messageInput; // New: For server to type messages
    private JButton startButton;
    private JButton stopButton;
    private JButton sendButton; // New: To send server messages

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Thread serverThread;
    private Thread clientReaderThread; // New: Dedicated thread for reading client messages

    private static final int PORT = 25050;

    public SocketServerGUI3() {
        super("Swing Chat Server");
        initComponents();
        setupLayout();
        setupListeners();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Handle closing manually
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                stopServer(); // Ensure server is stopped on close
                dispose();
            }
        });

        setSize(500, 400);
        setVisible(true);
        stopButton.setEnabled(false); // Server is not running initially
        messageInput.setEnabled(false); // Can't type until client connects
        sendButton.setEnabled(false);   // Can't send until client connects
    }

    private void initComponents() {
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);

        messageInput = new JTextField(); // Initialize the text field for input

        startButton = new JButton("Start Server");
        stopButton = new JButton("Stop Server");
        sendButton = new JButton("Send"); // Initialize the send button
    }

    private void setupLayout() {
        setLayout(new BorderLayout());
        add(new JScrollPane(messageArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(messageInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.NORTH); // Put input at the top or bottom, adjust as needed

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void setupListeners() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startServer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopServer();
            }
        });

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessageToClient();
            }
        });

        // Allow pressing Enter in the input field to send message
        messageInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessageToClient();
            }
        });
    }

    private void startServer() {
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        messageInput.setEnabled(false); // Still disabled until client connects
        sendButton.setEnabled(false);   // Still disabled until client connects
        appendToMessageArea("Server started...\n");

        serverThread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(PORT);
                appendToMessageArea("Waiting for client connection...\n");

                clientSocket = serverSocket.accept();
                appendToMessageArea("Client connected: " + clientSocket.getInetAddress().getHostAddress() + "\n");

                // Enable input and send button once client is connected
                SwingUtilities.invokeLater(() -> {
                    messageInput.setEnabled(true);
                    sendButton.setEnabled(true);
                    messageInput.requestFocusInWindow(); // Focus on input field
                });

                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Start a separate thread to continuously read from the client
                clientReaderThread = new Thread(() -> {
                    String inputLine;
                    try {
                        while (!Thread.currentThread().isInterrupted() && (inputLine = in.readLine()) != null) {
                            if (inputLine.equals("exit")) {
                                appendToMessageArea("Client requested to end the chat.\n");
                                break;
                            }
                            appendToMessageArea("Client: " + inputLine + "\n");
                        }
                    } catch (IOException e) {
                        if (!Thread.currentThread().isInterrupted()) { // Only report if not intentionally closed
                            appendToMessageArea("Client disconnected or error reading: " + e.getMessage() + "\n");
                        }
                    } finally {
                        // Client reader thread finished, signal main server thread if needed
                        // or handle full server shutdown.
                        // Here, we just let the main server thread's finally block handle cleanup.
                    }
                });
                clientReaderThread.start();

                // Keep the serverThread alive as long as clientReaderThread is active
                // or until an external stop is requested.
                try {
                    clientReaderThread.join(); // Wait for the client reader to finish (e.g., client disconnects/sends "exit")
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupt status
                    appendToMessageArea("Server thread interrupted while waiting for client reader.\n");
                }

            } catch (SocketException se) {
                appendToMessageArea("Server socket closed unexpectedly or server stopped.\n");
            } catch (IOException e) {
                appendToMessageArea("Server error: " + e.getMessage() + "\n");
                e.printStackTrace();
            } finally {
                // Ensure all resources are closed and UI is reset
                closeResources();
                SwingUtilities.invokeLater(() -> {
                    startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                    messageInput.setEnabled(false);
                    sendButton.setEnabled(false);
                });
                appendToMessageArea("Server stopped.\n");
            }
        });
        serverThread.start();
    }

    private void sendMessageToClient() {
        String message = messageInput.getText();
        if (message.trim().isEmpty()) {
            return; // Don't send empty messages
        }

        if (out != null) {
            out.println("Server: " + message);
            appendToMessageArea("Me: " + message + "\n");
            messageInput.setText(""); // Clear the input field
        } else {
            appendToMessageArea("Error: Client not connected or output stream not available.\n");
        }
    }

    private void stopServer() {
        // Interrupt the client reading thread first
        if (clientReaderThread != null && clientReaderThread.isAlive()) {
            clientReaderThread.interrupt();
            try {
                clientReaderThread.join(1000); // Give it a moment to stop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Then interrupt the main server thread
        if (serverThread != null && serverThread.isAlive()) {
            serverThread.interrupt();
            try {
                serverThread.join(1000); // Give it a moment to stop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        closeResources(); // Ensure all resources are properly closed
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        messageInput.setEnabled(false);
        sendButton.setEnabled(false);
        appendToMessageArea("Server explicitly stopped by user.\n");
    }

    private void closeResources() {
        try {
            if (in != null) {
                in.close();
                in = null;
            }
            if (out != null) {
                out.close();
                out = null;
            }
            if (clientSocket != null) {
                clientSocket.close();
                clientSocket = null;
            }
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
                serverSocket = null;
            }
        } catch (IOException e) {
            appendToMessageArea("Error closing resources: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private void appendToMessageArea(String text) {
        SwingUtilities.invokeLater(() -> {
            messageArea.append(text);
            // Auto-scroll to the bottom
            messageArea.setCaretPosition(messageArea.getDocument().getLength());
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SocketServerGUI3());
    }
}