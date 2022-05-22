package algorithms.mazeGenerators;

import java.util.ArrayList;

public class Cell {
    private int x;
    private int y;
    private Boolean visit;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.visit = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Boolean getVisit() {
        return visit;
    }

    public void setVisit(Boolean visit) {
        this.visit = visit;
    }

    public ArrayList<Cell> getNeighbors(Cell cell, Maze maze) {
        // here i will return all my available neigbors..
        ArrayList<Cell> frontiers = new ArrayList<>();
        if (cell.getX() - 1 >= 0) {
            Cell newCell = new Cell(cell.getX() - 1, cell.getY());
            if (!maze.getVisit(cell.getX() - 1, cell.getY())) {
                frontiers.add(newCell);
                maze.setVisit(cell.getX() - 1, cell.getY());
            }

        }
        return frontiers;
    }

}
