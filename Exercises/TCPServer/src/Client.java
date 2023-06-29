import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("127.0.0.1", 5000);
        Scanner scanner = new Scanner(System.in);

        PrintWriter output= new PrintWriter(clientSocket.getOutputStream(),true);

        while( clientSocket.isConnected() ) {

            System.out.println("Write a message");
            String input = scanner.nextLine();


            output.println(input);


        }

    }
}
