public class NpowerOptimised {
    public static void main(String[] args){
        int x=2;
        int n=30;
        System.out.println(recurPow(x,n));
    }
    public static int recurPow(int a,int n){
        if(n==1){
            return a;
        }
        int halfPow=recurPow(a,n/2);
        int halfPowSq=halfPow*halfPow;
        if(n%2!=0){
            halfPowSq*=a;
        }
        return halfPowSq;
    }
    
}
