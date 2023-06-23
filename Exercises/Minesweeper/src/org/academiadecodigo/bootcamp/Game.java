package org.academiadecodigo.bootcamp;

public class Game {
    private Grid grid;
    public static Squares[] squares;
    private Controller controller;

    public void init() {
        grid = new Grid();
        squares = new Squares[400];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Squares();
        }
        controller = new Controller();

    }

}
