package org.academiadecodigo.bootcamp;

public class Main {

    public static final String STRING = "test word words test 1 10 1";

    public static void main(String[] args) {
        WordHistogramComp wordHistogram = new WordHistogramComp(STRING);
        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for (String word : wordHistogram) {

            System.out.println(word + " : " + wordHistogram.get(word));

        }
        System.out.println("----------------------");

        WordHistogramInher wordHistogramInher = new WordHistogramInher(STRING);
        System.out.println("MAP has " + wordHistogramInher.size() + " distinct words");

        for (String word : wordHistogramInher) {

            System.out.println(word + " : " + wordHistogramInher.get(word));



        }
    }
}
