import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class main {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9000);  // Browser: localhost:9000/
        Socket socket = serverSocket.accept();
        // Establish connection
        System.out.println("Connection established");

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
        //BufferedWriter buf = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream() ));


        String httpHeader = br.readLine();
        System.out.println(httpHeader);

        String[] strArr = httpHeader.split(" ");

        if (strArr[1].equals("/logo.png")) {   // localhost:9000/logo.png

            File fr = new File("www/logo.png");
            String header = "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/png \r\n" +
                    "Content-Length: " + fr.length() + " \r\n" +
                    "\r\n";


            dOut.writeBytes(header);
            byte[] buffer = new byte[1024];
            int readBytes;
            FileInputStream in = new FileInputStream(fr);

            while ((readBytes = in.read(buffer)) != -1) {
                dOut.write(buffer, 0, readBytes);
            }
        }

        if (strArr[1].equals("/favicon.ico")) {

            File fr = new File("www/favicon.ico");
            String header = "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/ico \r\n" +
                    "Content-Length: " + fr.length() + " \r\n" +
                    "\r\n";


            dOut.writeBytes(header);
            byte[] buffer = new byte[1024];
            int readBytes;
            FileInputStream in = new FileInputStream(fr);

            while ((readBytes = in.read(buffer)) != -1) {
                dOut.write(buffer, 0, readBytes);
            }
        }


         /*   dOut.writeBytes(header);

            while (buff.ready()) {

                dOut.writeBytes(buff.readLine());
                dOut.flush();
            }

            dOut.close();
        }*/

        if (strArr[1].equals("/index.html")) {

            File fr = new File("www/index.html");
            long size = fr.length();
            String header = "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + size + " \r\n" +
                    "\r\n";

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fr));

            output.write(header);

            while (bufferedReader.ready()) {
                output.write(bufferedReader.readLine());
                output.flush();
            }

            output.close();
        }

        if (strArr[1].equals("/404.html")) {

            File fr = new File("www/404.html");
            long size = fr.length();
            String header = "HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + size + " \r\n" +
                    "\r\n";

            BufferedReader buff = new BufferedReader(new FileReader(fr));

            output.write(header);

            while (buff.ready()) {
                output.write(buff.readLine());
                output.flush();
            }

            output.close();

        }

    }

}