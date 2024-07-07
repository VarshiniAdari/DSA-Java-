import java.util.*;
public class MathFn {
    public static float Avg(int a,int b){
        float avg;
        avg=(float)(a+b)/2;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu.\n1.Minimum of a number\n2.Maximum of a number\n3.Square root of a number\n4.To find anumber raised to a power\n5.To find average of two numbers\n6.To find absolute value of a number");
        int choice=sc.nextInt();
        while(choice<7)
        {
            switch(choice)
        {
            case 1:{
                System.out.println("Enter 2 numbers");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                System.out.println("The minimum of the 2 numbers is "+Math.min(n1,n2));
                break;
            }
            case 2:{
                System.out.println("Ennter 2 numbers");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                System.out.println("The maximum of the 2 numbers is "+Math.max(n1,n2));
                break;
            }
            case 3:{
                System.out.println("Enter a number");
                int n=sc.nextInt();
                System.out.println("The square root of "+n+" is "+Math.sqrt(n));
                break;
            }
            case 4:{
                System.out.println("Enter base and power values");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                System.out.println(n1+" raised to "+n2+"is "+Math.pow(n1,n2));
                break;
            }
            case 5:{
                System.out.println("Enter 2 values");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                System.out.println("the average of above 2 numbers is "+Avg(n1,n2));
                break;
            }
            case 6:{
                System.out.println("Enter a number ");
                int n=sc.nextInt();
                System.out.println("Absolute value is "+Math.abs(n));
                break;
            }
            }
            System.out.println("Enter your choice");
            choice=sc.nextInt();
        }
        sc.close();
        }
    }

