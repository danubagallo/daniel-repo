import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        Socket clientSocket = serverSocket.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String line = "";
        while( (line = input.readLine()) != null ) {


            System.out.println("Message received:");
            System.out.println(line);

        }
        input.close();
        clientSocket.close();
        serverSocket.close();
    }
}
