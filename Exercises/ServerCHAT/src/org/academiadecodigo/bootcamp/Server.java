package org.academiadecodigo.bootcamp;

import com.sun.security.ntlm.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private ServerSocket serverSocket;
    public static final int PORT = 8000;
    private ExecutorService cachedPool;
    private Socket clientSocket;
    public static LinkedList<ClientWorker> list = new LinkedList();
    public static ClientWorker clientWorker;

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        // server.start();

        server.serverSocket = new ServerSocket(PORT);
        server.cachedPool = Executors.newCachedThreadPool();


        while (true) {
            server.clientSocket = server.serverSocket.accept();
            clientWorker = new ClientWorker(server.clientSocket);
            list.add(clientWorker);
            System.out.println("Connected to " + server.clientSocket.getInetAddress());

            server.cachedPool.submit(clientWorker);


        }
    }
}
