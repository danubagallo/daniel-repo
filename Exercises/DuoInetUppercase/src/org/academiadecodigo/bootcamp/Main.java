package org.academiadecodigo.bootcamp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Server

        while (true) {
            DatagramSocket socket = new DatagramSocket(5000);
            // Receive
            byte[] recvMessage = new byte[1024];
            DatagramPacket recvPacket = new DatagramPacket(recvMessage, recvMessage.length);
            socket.receive(recvPacket);
            String newMessage = new String(recvPacket.getData(), 0, recvPacket.getLength());
            System.out.println("Message received: " + newMessage);
            System.out.println("New message: " + newMessage.toUpperCase());
            recvPacket.getAddress();

            // Send
            byte[] sendMessage = newMessage.toUpperCase().getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendMessage, sendMessage.length, recvPacket.getAddress(), recvPacket.getPort());
            socket.send(sendPacket);

            socket.close();

        }
    }
}
