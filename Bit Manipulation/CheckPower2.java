import java.util.*;
public class CheckPower2 {//check if a number is a power of 2
    public static void main(String args[]){
        /*2^3=8 - 1000(n)
          n-1=7 - 0111(n-1)*/
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number to check if it is a power of 2 ");
          int num=sc.nextInt();
          if((num&(num-1))==0){
            System.out.println(num+" is a power of 2");
          }
          else{
            System.out.println(num+" is not a power of 2");
          }
          sc.close();
    }
    
}
