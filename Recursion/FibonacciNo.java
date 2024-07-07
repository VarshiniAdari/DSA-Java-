public class FibonacciNo {
    public static void main(String[] args){
        int n=8;
        int ans=0;
        ans=fibo(n-1)+fibo(n-2);
        System.out.println(ans);
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
}
