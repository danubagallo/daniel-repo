package org.academiadecodigo.bootcamp;

public class Calculations {
    public static RockPaperScissors guess() {
        int randomNumber = (int) Math.ceil(Math.random() * 3);
        if (randomNumber == 1) {
            return RockPaperScissors.ROCK;
        } else if (randomNumber == 2) {
            return RockPaperScissors.PAPER;
        } else {
            return RockPaperScissors.SCISSORS;
        }
    }

    public static int totalGames = 0;
    public static int winPlayer1 = 0;
    public static int winPlayer2 = 0;

}
