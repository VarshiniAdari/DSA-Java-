import java.util.*;
public class OddEven {
    public static void checkOddEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("The number "+n+" is even");
        }
        else{
            System.out.println("The number "+n+" is an odd number");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check odd or even");
        int num = sc.nextInt();
        checkOddEven(num);
        sc.close();
    }
    
}
