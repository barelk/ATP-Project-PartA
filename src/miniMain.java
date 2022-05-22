import algorithms.mazeGenerators.EmptyMazeGenerator;
import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.SimpleMazeGenerator;

public class miniMain {

        public static void main(String[] args) {

                IMazeGenerator maze = new EmptyMazeGenerator();
                Maze myMaze = maze.generate(10,10);
                myMaze.myPrint();
                System.out.print(myMaze);
                //System.out.println(maze.measureAlgorithmTimeMillis(500,57878));


        }
}
