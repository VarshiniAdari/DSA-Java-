import java.util.*;
public class SmallestInArray {
    public static int Smallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int numbers[]=new int[10];
       for(int i=0;i<numbers.length;i++){
       numbers[i]=sc.nextInt();
       }
       System.out.println("Smallest number in the array is "+Smallest(numbers));
       sc.close();
    }
}
