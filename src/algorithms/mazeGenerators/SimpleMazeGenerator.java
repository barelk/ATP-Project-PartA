package algorithms.mazeGenerators;

import java.util.Random;
import java.util.*;
public class SimpleMazeGenerator extends AMazeGenerator {
    public Maze generate(int row, int col) {
        Maze simple = new Maze(row,col);
        int emptyMatrix[][] = new int[row][col];
        Random ran = new Random();
        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col;j++)
            {

                emptyMatrix[i][j] = ran.nextInt(2);
            }
        }
        simple.setMatrix(emptyMatrix);
        return simple;
    }
}
