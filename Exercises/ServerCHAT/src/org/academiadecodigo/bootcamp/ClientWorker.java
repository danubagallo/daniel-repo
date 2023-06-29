package org.academiadecodigo.bootcamp;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class ClientWorker implements Runnable {

    private Socket clientSocket;

    public ClientWorker(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
    }


    @Override
    public void run() {
        BufferedReader bf;
        try {
            bf = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {

            String message;
            try {
                message = bf.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (message == null) {
                try {
                    clientSocket.close();
                    System.out.println("Disconnected from " + clientSocket.getInetAddress());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Message received from " + clientSocket.getInetAddress() + ": " + message);
            broadcast(message, Server.clientWorker);

        }
    }


    public void broadcast(String message, ClientWorker clientWorker) {

        for (int i = 0; i < Server.list.size(); i++) {
            if (Server.list.indexOf(clientWorker) != i) {
                System.out.println(Server.list.indexOf(clientWorker));
                PrintWriter output;
                try {
                    output = new PrintWriter(Server.list.get(i).clientSocket.getOutputStream(), true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                output.println(clientSocket.getInetAddress() + " said: " + message);


            }
        }
    }
}