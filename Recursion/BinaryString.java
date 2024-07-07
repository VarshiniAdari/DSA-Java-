public class BinaryString {
    public static void main(String[] args){
        int n=3;
        printBinStr(n,0,new String(""));
    }
    public static void printBinStr(int n, int prev, String binStr){
        if(n==0){
            System.out.println(binStr);
            return;
            
        }
        printBinStr(n-1,0,binStr+"0");
        if(prev==0){   
            printBinStr(n-1,1,binStr+"1");
        }
    }
}
