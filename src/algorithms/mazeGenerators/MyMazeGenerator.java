package algorithms.mazeGenerators;
import java.util.ArrayList;
import java.util.Random;


public class MyMazeGenerator extends AMazeGenerator {
    @Override
    public Maze generate(int row, int col) {
        ArrayList<Cell> frontiers = new ArrayList<>();
        IMazeGenerator maze = new EmptyMazeGenerator();
        Maze myMaze = maze.generate(row,col);
        Random rand = new Random();
        int x = rand.nextInt(row); // random starting position
        int y = rand.nextInt(col);
        Cell start = new Cell(x,y);
        myMaze.setVisit(x,y);
        frontiers.add(start);
        frontiers.addAll(getNeighbors(start,myMaze));
        while (!frontiers.isEmpty()){
            int i = rand.nextInt(frontiers.size());
            Cell cell = frontiers.get(i);
            myMaze.setMatrixCell(cell.getX(), cell.getY(), 0);
            frontiers.remove(i);
            frontiers.addAll(getNeighbors(cell,myMaze));

        }

        return null;
    }

    public ArrayList<Cell> getNeighbors(Cell cell, Maze maze){
        // here i will return all my available neigbors..
        ArrayList<Cell> frontiers = new ArrayList<>();
        if (cell.getX() - 1 >= 0){
            Cell newCell = new Cell(cell.getX()-1, cell.getY());
            if (!maze.getVisit(cell.getX()-1, cell.getY())){
                frontiers.add( newCell);
                maze.setVisit(cell.getX() -1,cell.getY());
            }


        }
        return null;
    }

}
