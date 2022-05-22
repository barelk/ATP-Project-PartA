package algorithms.mazeGenerators;
import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;

//Randomized DFS
public class MyMazeGenerator2  extends AMazeGenerator{
    public Maze generate(int row, int col) {
        Random rand = new Random();
        Stack<Cell> stk = new Stack<>();
        ArrayList<Cell> neighbours = new ArrayList<>();
        IMazeGenerator maze = new EmptyMazeGenerator();
        Maze myMaze = maze.generate(row, col);
        Cell scell = new Cell(0,0);
        scell.setVisit(true);
        myMaze.setVisit(0,0);
        myMaze.setMatrixCell(0,0,0);
        stk.push(scell);
        while(!stk.isEmpty()){
            Cell CurrCell = stk.pop();
            neighbours = CurrCell.getNeighbors(CurrCell,myMaze);
            if (!neighbours.isEmpty()){
                int idx = rand.nextInt(neighbours.size());
                Cell ChosenCell = neighbours.get(idx);
                // remove wall between current cell and chosen cell
                ChosenCell.setVisit(true);
                myMaze.setVisit(ChosenCell.getX(),ChosenCell.getY());
                stk.push(ChosenCell);
            }
            }
        return myMaze;
        }


    }

