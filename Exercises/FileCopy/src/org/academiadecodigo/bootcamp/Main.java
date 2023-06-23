package org.academiadecodigo.bootcamp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("/Users/codecadet/Documents/daniel-gallo-repo/Exercises/FileCopy/src/resources/File");
        FileOutputStream outputStream = new FileOutputStream("/Users/codecadet/Documents/daniel-gallo-repo/Exercises/FileCopy/src/resources/File2");

        byte[] buffer = new byte[1024];
        int num = inputStream.read(buffer);

        if (num != -1) {
            System.out.println("I have this many bytes file: " + num);
        }




        //buffer = "resources/File.rtf".getBytes();
        outputStream.write(buffer, 0, num);
        inputStream.close();
        outputStream.close();
    }

}