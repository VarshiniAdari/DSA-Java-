import java.util.*;
public class BinomialCoeff {//nC^r  permutations and combinations formula n!/r!(n-r)!
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        sc.close();
        System.out.println("Binomial Coefficient is"+fact(n)/(fact(r)*fact(n-r)));


    }
    
}
