import java.util.*;
public class ContinueExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number ");
            int n=sc.nextInt();
            System.out.println();
            if(n%10==0){
                continue; //it goes back to the check the condition but does not print the number divisible by 10
            }
            System.out.println("Your number is "+n);
            sc.close();
        }while(true);
        
    }
    
}
