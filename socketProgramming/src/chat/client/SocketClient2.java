package chat.client;
import java.io.*;
import java.net.*;
public class SocketClient2 {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java SocketClient <server-ip>");
            return;
        }

        String serverIp = args[0];
        int port = 15120;

        System.out.println("Connecting to server at " + serverIp + ":" + port);
        try (Socket socket = new Socket(serverIp, port)) {
            System.out.println("Connected to server at " + serverIp + ":" + port);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String userMessage;
            System.out.println("Type your messages:");
            userMessage = userInput.readLine();
            out.println(userMessage);
            System.out.println("Message sent to server.");
            System.out.println("Waiting for server response...");
            String response = in.readLine();
            System.out.println("Server response: " + response);

        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("Connection closed.");
    }

}
