import java.util.*;
public class Prime1 {
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
    }
    
}
