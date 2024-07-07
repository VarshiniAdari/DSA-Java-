public class DecOrd{
    public static void main(String[] args){
        int n=10;
        printVal(n);
    }
    public static void printVal(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printVal(n-1);
    }
}