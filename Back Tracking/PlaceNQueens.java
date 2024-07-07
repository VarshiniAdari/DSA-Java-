public class PlaceNQueens {
    static int possibilty=0;
    public static void main(String[] args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
        System.out.println("No. of ways to solve "+possibilty);
    }
    public static void nQueens(char[][] board, int row){
        //Base case
        if(row==board.length){
            System.out.println("------chess board---------");
            printPos(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)==true){ //check if it is safe
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='.'; //backtracking step
            }
        }
    }
    public static boolean isSafe(char[][] board,int row, int col){
        //check up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //check left diagonal
        for(int i=row-1,j=col-1; i>=0&&j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
             }
        }

        //check right diagonal
        for(int i=row-1,j=col+1; i>=0&&j<board.length;i--,j++){
             if(board[i][j]=='Q'){
                return false;
             }
        }
        return true;


    }
    public static void printPos(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}