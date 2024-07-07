import java.util.*;
public class SetCount {
    public static int getCount(int n){
        int count=0;
        while (n>0) {
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("No. of set bits in "+num+" are "+getCount(num));
        sc.close();
    }
    
}
