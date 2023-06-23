package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {


        Range r = new Range(-5,5,false);
        for (Integer element : r) {
            System.out.println(element);
        }
    }
}