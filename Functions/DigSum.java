import java.util.*;
public class DigSum {
    public static void calcSum(int n){
        int rem=0;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum of the digits is "+sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        calcSum(num);
        sc.close();

    }    
}
