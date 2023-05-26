package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {
        Players player1 = new Players("Daniel");
        Players player2 = new Players("Fernando");

        int maxGames = 10;

        System.out.println("--- GAME STARTS ---");

        while (Calculations.totalGames < maxGames) {
            RockPaperScissors guess1 = Calculations.guess();
            System.out.println(player1.name + " played " + guess1);
            RockPaperScissors guess2 = Calculations.guess();
            System.out.println(player2.name + " played " + guess2);

            while (guess1 == guess2) {
                guess1 = Calculations.guess();
                System.out.println(player1.name + " played " + guess1);
                guess2 = Calculations.guess();
                System.out.println(player2.name + " played " + guess2);
            }

            switch (guess1) {
                case SCISSORS:
                    if (guess2 == RockPaperScissors.ROCK) {
                        System.out.println(player2.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer2++;
                        break;
                    } else {
                        System.out.println(player1.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer1++;
                        break;
                    }
                case PAPER:
                    if (guess2 == RockPaperScissors.ROCK) {
                        System.out.println(player1.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer1++;
                        break;
                    } else {
                        System.out.println(player2.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer2++;
                        break;
                    }
                case ROCK:
                    if (guess2 == RockPaperScissors.PAPER) {
                        System.out.println(player2.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer2++;
                        break;
                    } else {
                        System.out.println(player1.name + " wins the round!");
                        Calculations.totalGames++;
                        Calculations.winPlayer1++;
                        break;
                    }
            }

            System.out.println("End of round! Current score: " + player1.name + " " + Calculations.winPlayer1 + " and " + player2.name + " " + Calculations.winPlayer2 + ".");
        }

        if (Calculations.winPlayer1 > Calculations.winPlayer2) {
            System.out.println("END OF GAME!! " + player1.name + " won the game!!!");
        } else if (Calculations.winPlayer2 > Calculations.winPlayer1) {
            System.out.println("END OF GAME!! " + player2.name + " won the game!!!");
        } else {
            System.out.println("END OF GAME!! Game ended on a draw!");
        }

    }
}
