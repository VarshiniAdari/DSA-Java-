import java.util.*;//reverse of the number is printed but not stored
public class Reverse{
    public static void main(String args[]){
        System.out.println("Enter a number to reverse it");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        while (num>0){
            System.out.print(num%10);
            num/=10;
        }
    }
}