package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        simpleGfxGrid = grid;
        this.rectangle = new Rectangle(simpleGfxGrid.columnToX(getCol()), simpleGfxGrid.rowToY(getRow()), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        show();

    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        simpleGfxGrid = grid;
        this.rectangle = new Rectangle(simpleGfxGrid.columnToX(col), simpleGfxGrid.rowToY(row), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        int x = getCol();
        int y = getRow();

        super.moveInDirection(direction, distance);

        int x2 = getCol();
        int y2 = getRow();

        int x3 = simpleGfxGrid.columnToX(x2) - simpleGfxGrid.columnToX(x);
        int y3 = simpleGfxGrid.rowToY(y2) - simpleGfxGrid.rowToY(y);

        this.rectangle.translate(x3, y3);

    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        super.setColor(color);
    }

}

// original

