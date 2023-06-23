package org.academiadecodigo.bootcamp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Client 2

        while (true) {
            DatagramSocket socket = new DatagramSocket(7000);
            // Scanner
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // Send
            String message = input;
            byte[] sendMessage = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendMessage, sendMessage.length, InetAddress.getByName("192.168.2.177"), 5000);
            socket.send(sendPacket);

            // Receive
            byte[] recvMessage = new byte[1024];
            DatagramPacket recvPacket = new DatagramPacket(recvMessage, recvMessage.length);
            socket.receive(recvPacket);
            String upperCase = new String(recvPacket.getData(), 0, recvPacket.getLength());
            System.out.println("New message received: " + upperCase);

            socket.close();
        }
    }
}
