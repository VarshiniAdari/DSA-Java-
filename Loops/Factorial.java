import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int fact=1;
        int i;
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of"+num+" is "+fact);
    }
    
}