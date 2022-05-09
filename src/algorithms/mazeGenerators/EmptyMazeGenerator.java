package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator{
    public Maze generate(int row, int col) {
        Maze emptyMaze = new Maze(row,col);
        int matrix[][] = new int[row][col];
        emptyMaze.setMatrix(matrix);
        return emptyMaze;
    }

}
