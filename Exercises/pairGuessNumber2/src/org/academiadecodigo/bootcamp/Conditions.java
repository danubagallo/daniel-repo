package org.academiadecodigo.bootcamp;

public class Conditions {

    // Property - function is calculated once and stored inside winCondition
    public static int winCondition = (int) Math.floor(Math.random() * (Player.guessRange + 1));
}
