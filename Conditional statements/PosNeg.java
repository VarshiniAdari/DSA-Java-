import java.util.*;
public class PosNeg{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
        if(num>0){
            System.out.println(num+" is a positive number");

        }
        else{
            System.out.println(num+" is a negative nuumber");
        }

    }
}