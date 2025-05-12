import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client...");

        Socket socket = server.accept();
        System.out.println("Client connected.");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        Thread receive = new Thread(() -> {
            try {
                String msg;
                while ((msg = input.readLine()) != null) {
                    System.out.println("Client: " + msg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        receive.start();

        String message;
        while ((message = userInput.readLine()) != null) {
            output.println(message);
        }

        socket.close();
        server.close();
    }
}
