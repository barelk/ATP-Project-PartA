package algorithms.mazeGenerators;
import java.lang.*;


abstract class AMazeGenerator implements IMazeGenerator {
    public abstract Maze generate(int row, int col);

    public long measureAlgorithmTimeMillis(int row, int col){
       long start = System.currentTimeMillis();
        this.generate(row,col);
        long end = System.currentTimeMillis();
        return end - start;

    }
}
