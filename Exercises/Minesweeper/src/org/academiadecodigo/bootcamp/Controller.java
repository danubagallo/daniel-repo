package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.security.Key;
import java.util.concurrent.TimeUnit;


public class Controller implements KeyboardHandler {
    private Rectangle control;
    private Keyboard keyboard;
    private Squares[] squareSave = new Squares[400];


    public Controller() {
        control = new Rectangle(Grid.PADDING, Grid.PADDING, Squares.width, Squares.height);
        control.setColor(Color.BLACK);
        control.draw();
        control.fill();

        keyboard = new Keyboard(this);
        addKeyboard();
    }

    private void addKeyboard() {
        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent paint = new KeyboardEvent();
        paint.setKey(KeyboardEvent.KEY_SPACE);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(paint);

        KeyboardEvent undo = new KeyboardEvent();
        undo.setKey(KeyboardEvent.KEY_Z);
        undo.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(undo);

        KeyboardEvent save = new KeyboardEvent();
        save.setKey(KeyboardEvent.KEY_K);
        save.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(save);

        KeyboardEvent load = new KeyboardEvent();
        load.setKey(KeyboardEvent.KEY_L);
        load.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(load);
    }

    public void moveRight() {
        control.translate(Squares.width, 0);
    }

    public void moveLeft() {
        control.translate(-Squares.width, 0);
    }

    public void moveUp() {
        control.translate(0, -Squares.height);
    }

    public void moveDown() {
        control.translate(0, Squares.height);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyPressed = keyboardEvent.getKey();

        Rectangle r = null;

        if (keyPressed == 39) {
            if (control.getX() < Grid.gameBorder.getWidth() + Grid.PADDING - Squares.width) {
                moveRight();
            }
        }
        if (keyPressed == 37) {
            if (control.getX() > Grid.PADDING) {
                moveLeft();
            }

        }
        if (keyPressed == 38) {
            if (control.getY() > Grid.PADDING) {
                moveUp();
            }
        }
        if (keyPressed == KeyboardEvent.KEY_DOWN) {
            if (control.getY() < Grid.PADDING + Grid.height - Squares.height) {
                moveDown();
            }
        }
        if (keyPressed == KeyboardEvent.KEY_SPACE) {

            for (int i = 0; i < Game.squares.length; i++) {
                if ((control.getX() == Game.squares[i].getFinalX()) && (control.getY() == Game.squares[i].getFinalY())) {
                    Game.squares[i].setColorBoolean();
                    Game.squares[i].fill();
                }


          /*  r = new Rectangle(control.getX(), control.getY(), control.getWidth(), control.getHeight());
            r.setColor(Color.BLACK);
            r.draw();
            r.fill();*/

            }
        }
        if (keyPressed == KeyboardEvent.KEY_Z) {
            r = new Rectangle(control.getX(), control.getY(), control.getWidth(), control.getHeight());

            r.setColor(Color.WHITE);
            r.fill();


            Line[] linesX = new Line[20];
            Line[] linesY = new Line[20];

            for (int i = 0; (i < 20); i++) {

                linesY[i] = new Line(Grid.PADDING, Grid.PADDING + 40 + i * 40, Grid.PADDING + 800, Grid.PADDING + 40 + i * 40);
                linesY[i].setColor(Color.BLACK);
                linesY[i].draw();

                linesX[i] = new Line(Grid.PADDING + 40 + i * 40, Grid.PADDING, Grid.PADDING + 40 + i * 40, Grid.PADDING + 800);
                linesX[i].setColor(Color.BLACK);
                linesX[i].draw();

            }

        }

        if (keyPressed == KeyboardEvent.KEY_K) {
            for (int i = 0; i < Game.squares.length; i++) {
                squareSave[i] = Game.squares[i];

            }

        }

        if (keyPressed == KeyboardEvent.KEY_L) {
            for (int i = 0; i < Game.squares.length; i++) {
                Game.squares[i] = squareSave[i];

                Game.squares[i].draw();

            }
        }


    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
