package org.academiadecodigo.bootcamp;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String host = getHost();

        InetAddress address = InetAddress.getByName(host);

        System.out.println("Testing reachability for " + address.getHostAddress());

        System.out.println(address.isReachable(5000) ? "OK" : "Fail");


    }
    public static String getHost() {

        Scanner reader = new Scanner(System.in);
        System.out.println("HostName? ");
        return reader.nextLine();

    }
}
