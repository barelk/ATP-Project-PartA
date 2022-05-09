package algorithms.mazeGenerators
abstract class AMazeGenerator implements IMazeGenerator {
    public abstract Maze generate(int row, int col);

    public long measureAlgorithmTimeMillis(int row, int col) {
        return 0;
    }
}
