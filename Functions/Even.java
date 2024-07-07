import java.util.*;
public class Even {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(isEven(n)==true){
            System.out.println("number "+n+"is an even number");

        }
        else{
            System.out.println("The number "+n+" is an odd number");
        }
        sc.close();

    }
    
}
