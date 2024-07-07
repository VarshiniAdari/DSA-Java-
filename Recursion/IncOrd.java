public class IncOrd {
        public static void main(String[] args){
        int n=5;
        printVal(n);
    }
    public static void printVal(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        printVal(n-1);
        System.out.println(n);
        return; //optional there even if you do not write
    }
    
}
