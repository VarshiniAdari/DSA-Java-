import java.util.*;
public class EvOdSum {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many numbers you want to enter");
        int count =sc.nextInt();
        
        int EvSum=0;
        int OdSum=0;
        int num;
        System.out.println("Enter numbers");
        for(int i=0;i<count;i++){
            
            num = sc.nextInt();
            if(num%2==0)
            {
                EvSum=EvSum+num;
                
            }
            else{
                OdSum=OdSum+num;
               
            }
            
        }
        sc.close(); 
        System.out.println("Even sum is "+EvSum);
        System.out.println("Odd sum is "+OdSum);

    }
}