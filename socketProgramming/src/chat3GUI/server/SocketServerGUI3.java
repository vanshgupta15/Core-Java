package chat3GUI.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class SocketServerGUI3 extends JFrame {

    private JTextArea messageArea;
    private JButton startButton;
    private JButton stopButton;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Thread serverThread;

    private static final int PORT = 25050;

    public SocketServerGUI3() {
        super("Swing Chat Server");
        initComponents();
        setupLayout();
        setupListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
        stopButton.setEnabled(false); // Server is not running initially
    }

    private void initComponents() {
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        startButton = new JButton("Start Server");
        stopButton = new JButton("Stop Server");
    }

    private void setupLayout() {
        setLayout(new BorderLayout());
        add(new JScrollPane(messageArea), BorderLayout.CENTER);

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
    }

    private void startServer() {
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
        messageArea.append("Server started...\n");

        serverThread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(PORT);
                appendToMessageArea("Waiting for client connection...\n");

                clientSocket = serverSocket.accept();
                appendToMessageArea("Client connected: " + clientSocket.getInetAddress().getHostAddress() + "\n");

                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String inputLine;
                while (!Thread.currentThread().isInterrupted() && (inputLine = in.readLine()) != null) {
                    if (inputLine.equals("exit")) {
                        appendToMessageArea("Client requested to end the chat.\n");
                        break;
                    }
                    appendToMessageArea("Received: " + inputLine + "\n");
                    out.println("Echo: " + inputLine);
                    appendToMessageArea("Sent response to client.\n");
                }

            } catch (SocketException se) {
                appendToMessageArea("Server socket closed unexpectedly.\n");
            } catch (IOException e) {
                appendToMessageArea("Server error: " + e.getMessage() + "\n");
                e.printStackTrace();
            } finally {
                closeResources();
                SwingUtilities.invokeLater(() -> {
                    startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                });
                appendToMessageArea("Server stopped.\n");
            }
        });
        serverThread.start();
    }

    private void stopServer() {
        if (serverThread != null && serverThread.isAlive()) {
            serverThread.interrupt(); // Signal the thread to stop
        }
        closeResources();
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        appendToMessageArea("Server stopped.\n");
    }

    private void closeResources() {
        try {
            if (in != null) in.close();
            if (out != null) out.close();
            if (clientSocket != null) clientSocket.close();
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            appendToMessageArea("Error closing resources: " + e.getMessage() + "\n");
            e.printStackTrace();
        } finally {
            in = null;
            out = null;
            clientSocket = null;
            serverSocket = null;
        }
    }

    private void appendToMessageArea(String text) {
        SwingUtilities.invokeLater(() -> messageArea.append(text));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SocketServerGUI3());
    }
}