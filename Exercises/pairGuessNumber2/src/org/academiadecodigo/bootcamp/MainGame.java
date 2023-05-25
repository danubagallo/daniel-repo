package org.academiadecodigo.bootcamp;

import java.sql.SQLOutput;

public class MainGame {
    public static void main(String[] args) {

        Player player1 = new Player("Daniel", 34); // Object
        Player player2 = new Player("Fernando", 44);  // Object

        int guess1 = -1;
        int guess2 = -1;

        Player.guessRange = 100; // MAX VALUE

        System.out.println("--- GAME STARTS ---");

        System.out.println("Correct number is " + Conditions.winCondition + ".");


        while ((guess1 != Conditions.winCondition) && (guess2 != Conditions.winCondition)) {
            guess1 = player1.guess();
            System.out.println(player1.name + " guessed " + guess1 + ".");
            if (guess1 != Conditions.winCondition) {
                guess2 = player2.guess();
                System.out.println(player2.name + " guessed " + guess2 + ".");
            }
        }

        if (guess1 == Conditions.winCondition) {
            System.out.println("GAME OVER - " + player1.name + " wins!!!");
        } else {
            System.out.println("GAME OVER - " + player2.name + " wins!!!");
        }
    }
}
