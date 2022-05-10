package algorithms.mazeGenerators;
public class Maze {
    private int col;
    private int row;
    private int matrix[][];
    private Boolean visit[][];
    public Maze(int row, int col) {
        this.col = col;
        this.row = row;
        for (int i=0; i<row; i++){
            for (int j=0; j<col;j++){
                visit[i][j] = false;
            }
        }
    } // complete to string method...
    public Boolean getVisit(int row, int col){
        return visit[row][col];
    }
    public void setVisit(int row,int col){
        visit[row][col] = true;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrixCell(int row, int col, int val) {
        this.matrix[row][col] = val;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public void printaze(){
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print(this.matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
