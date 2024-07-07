public class FrndsPairingProblem{
    public static int NoOfWays(int n){
        if(n==1||n==2){
            return n;
        }
        return NoOfWays(n-1)+NoOfWays(n-2)*(n-1);
    }
    public static void main(String[]args){
        int n=4;
        System.out.println(NoOfWays(n)); 
    }
}