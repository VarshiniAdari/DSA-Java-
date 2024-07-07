public class PowerN {
    public static void main(String[]args){
        int x=2;
        int n=10;
        System.out.println(recurPow(x,n));
    }
    public static int recurPow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*recurPow(x, n-1);
    }
    
}
