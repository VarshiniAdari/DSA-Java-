import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        boolean isPrime=true;
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime nunmber");
        }
        else{
            System.out.println("Not prime");
        }
        
    }
    
}
