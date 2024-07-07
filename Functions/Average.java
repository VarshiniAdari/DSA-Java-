import java.util.*;
public class Average {
    public static float Avg(int a,int b, int c){
        float avg=(float)(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Average of 3 numbers = "+Avg(num1,num2,num3));
        sc.close();
    }
}
