import java.util.*;
public class BinomialCoeff2{
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int BinCoeff(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        return a/(b*c);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        sc.close();
        System.out.println("Binomial Coeffincient is"+BinCoeff(n,r));


    }
    
}
