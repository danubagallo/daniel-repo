package org.academiadecodigo.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class WordReader implements Iterable<String> {
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    String line = "";
    String result = "";


    public WordReader(String file) throws FileNotFoundException {
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator() {

            public boolean readFile() {

                try {
                    return (line = bufferedReader.readLine()) != null;
                } catch (IOException ex) {
                    return false;
                }
            }

            @Override
            public boolean hasNext() {
                return readFile();

            }

            @Override
            public String next() {
                return line;
            }

        };
    }
}