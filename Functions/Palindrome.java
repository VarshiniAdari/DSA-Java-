import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPalin(num);
        sc.close();
        

    }
    public static void isPalin(int n){
        int myNum=n;
        int rem=0;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==myNum)
        {
            System.out.println(myNum+" is a palindrome number");
            return;
        }
        System.out.println(myNum+" is not a palindrome number");
        return;
    }
}
