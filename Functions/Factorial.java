import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        sc.close();
        System.out.println(fact(n));

    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
}