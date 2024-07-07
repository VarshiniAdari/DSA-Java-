import java.util.*;
public class FibonacciSeries {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a=-1,b=1;
      int c=0;
      for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
        System.out.println();
      }
    }
    
}
