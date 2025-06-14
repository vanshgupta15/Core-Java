package chat.server;
import java.io.*;
import java.net.*;
public class SocketServer2 {
    public static void main(String[] args) {
        System.out.println("Server started...");
        try {
            ServerSocket serverSocket = new ServerSocket(15120);
            System.out.println("Waiting for client connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine;
            inputLine = in.readLine();
            System.out.println("Received: " + inputLine);
            out.write("Echo: " + inputLine);
            out.flush();
            System.out.println("Sent response to client.");
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server stopped.");
    }
}
