package org.academiadecodigo.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader terminal = new BufferedReader(new InputStreamReader(System.in));

        // Scanner scanner = new Scanner(System.in);

        System.out.println("URL: ");
        String site = terminal.readLine();
        // String site2 = scanner.nextLine();

        //URL url = new URL("https://www.google.com");
        URL url = new URL(site);

        // Check the close point for this BufferedReader
        terminal.close();


        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = "";
        while (br.ready()) {  // (line = br.readLine()) != null
            System.out.println(br.readLine());  // line
        }

        br.close();

    }
}
