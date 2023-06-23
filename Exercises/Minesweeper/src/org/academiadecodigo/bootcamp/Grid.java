package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Grid {

    public static Rectangle gameBorder;
    public static final int width = 800;
    public static final int height = 800;
    public static final int PADDING = 10;
    private Keyboard keyboard;

    public Grid() {

        gameBorder = new Rectangle(PADDING, PADDING, width, height);
        gameBorder.draw();

    }
    public static Rectangle getGameBorder() {
        return gameBorder;
    }

}

