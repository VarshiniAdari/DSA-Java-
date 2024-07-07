import java.util.*;
public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int sRow=0;
        int eRow=matrix.length-1;
        int sCol=0;
        int eCol=matrix[0].length-1;
        while(sRow<=eRow&&sCol<=eCol){
            for(int col=sCol;col<=eCol;col++){
               
                System.out.println(matrix[sRow][col]);
            }
            for(int row=sRow+1;row<=eRow;row++){
                
                System.out.println(matrix[row][eCol]);
            }
            for(int col=eCol-1;col>=sCol;col--){
                if(sRow==eRow){
                    break;
                }
                System.out.println(matrix[eRow][col]);
            }
            for(int row=eRow-1;row>sRow;row--){
                if(eCol==sCol){
                    break;
                }
                System.out.println(matrix[row][sCol]);
            }
            sRow++;
            eRow--;
            sCol++;
            eCol--;
        }
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
        printSpiral(matrix);
        sc.close();
    }
    
}
