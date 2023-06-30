package org.academiadecodigo.bootcamp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        //System.out.println(message);

        String newMessage = Stream.of(message.split(" ")) // String or List?
                .filter(word -> !word.contains("garbage"))
                .map(word -> new String(word.toUpperCase()))
                .reduce("",(acc, elem) -> acc.isEmpty() ? elem : acc + " " + elem); //reduce to return String. If use collect, the return List


        System.out.println(newMessage);

    }
}
