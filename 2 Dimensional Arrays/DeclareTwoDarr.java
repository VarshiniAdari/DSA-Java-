
import java.util.Scanner;

public class DeclareTwoDarr {
    public static void main(String args[]){
        int matrix[][]=new int[4][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
