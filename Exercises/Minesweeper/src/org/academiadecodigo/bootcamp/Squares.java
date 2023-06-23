package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Squares {
    public static Rectangle tinySq;
    public static final int width = 40;
    public static int cumulativeX = Grid.PADDING;
    public static int finalX;
    public static final int height = 40;
    public static int cumulativeY = Grid.PADDING;
    public static int finalY;
    public static int linesCounter = 0;
    private boolean colorBoolean;

    public Squares() {

        this.tinySq = new Rectangle(cumulativeX, cumulativeY, width, height);
        this.finalX = cumulativeX;
        this.finalY = cumulativeY;
        cumulativeX = cumulativeX + 40;
        if (cumulativeX >= Grid.width + Grid.PADDING) {
            linesCounter++;
            cumulativeX = Grid.PADDING;
            cumulativeY = cumulativeY + 40;
        }
        colorBoolean = true;

        tinySq.draw();
        if (colorBoolean == true) {
            tinySq.setColor(Color.WHITE);
        } else {
            tinySq.setColor(Color.BLACK);
        }
    }

    public void draw() {
        tinySq.draw();
    }

    public void fill() {
        tinySq.fill();
    }

    public int getFinalX() {
        return finalX;
    }

    public int getFinalY() {
        return finalY;
    }

    public void setColorBoolean() {
        if (colorBoolean == true) {
            colorBoolean = false;
        } else {
            colorBoolean = true;
        }
    }
}
