public class SudokuSolver {
    public static void main(String[] args){
        int[][] sudoku={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(Sudoku(sudoku,0,0)==true){
            System.out.println("Solution exists");
            print2D(sudoku);
        }
        else{
            System.out.println("There is no solution");
        }
        
    }
    public static void print2D(int[][] sudoku){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+",");
            }
            System.out.println();
        }
    }
    public static boolean Sudoku(int[][] sudoku, int row,int col){
        //Base case
        if(row==9){
            return true;
        }

        //Recursion
        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            return Sudoku(sudoku,row+1,0);
        }
        if(sudoku[row][col]!=0){
            return Sudoku(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)==true){
                sudoku[row][col]=digit;
                if(Sudoku(sudoku,nextRow,nextCol)==true){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] sudoku,int row,int col,int digit){
        //Check entire row
        for(int j=0;j<9;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //check entire coloumn
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //check entire grid
         //get starting row and col ans ending
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        int er=sr+2;
        int ec=sc+2;
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        //if not present in row,col or grid
        return true;


    }
    
}
