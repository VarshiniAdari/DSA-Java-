import java.util.*;
public class Prime3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    
}
