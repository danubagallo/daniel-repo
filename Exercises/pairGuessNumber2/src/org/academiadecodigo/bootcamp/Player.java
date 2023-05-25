package org.academiadecodigo.bootcamp;

public class Player {
    public String name;
    public int age;

    public static int guessRange;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Method - function repeats itself when invoked
    public int guess() {
        return ((int) Math.floor(Math.random() * (guessRange + 1)));
    }
}
