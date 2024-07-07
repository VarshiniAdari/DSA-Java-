import java.io.*;
import java.util.*;

public class triangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<=i;j++){
                if(j==0){
                    for(int k=0;k<i;k++){
                    System.out.print(" ");
                    }
                }
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
