package org.academiadecodigo.bootcamp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        WordReader wordReader = new WordReader("src/resources/Danuba");

        for(String word : wordReader){
            System.out.println(word);
        }


        /*
        FileReader fileReader = new FileReader("resources/lorem.txt");

        char[] buffer = new char[1024];
        int num;

        while((num = fileReader.read(buffer)) != -1 ) {
            String resultingString = new String(buffer);
            System.out.println(resultingString);
        }

        fileReader.close();

    }*/
    }
}