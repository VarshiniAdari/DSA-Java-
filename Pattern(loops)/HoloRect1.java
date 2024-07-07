import java.util.*;
public class HoloRect1 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int rws=sc.nextInt();
         int col=sc.nextInt();
         sc.close();
         for(int i=1;i<=rws;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==rws||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
         }       
    }
    
}
