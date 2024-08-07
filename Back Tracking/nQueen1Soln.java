public class nQueen1Soln {
    
    public static void main(String[] args){
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
        
    }
    public static void nQueens(char[][] board, int row){
        //Base case
        if(row==board.length){
            
            printPos(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)==true){
                board[row][j]='Q';
                nQueens(board,row+1);
                return; //return directly to print only 1 soln
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
