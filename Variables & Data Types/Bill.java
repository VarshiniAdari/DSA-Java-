import java.util.*; 
public class Bill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pnclCost = sc.nextFloat();
        float pnCost = sc.nextFloat();
        float ersrCost = sc.nextFloat();
        sc.close();
        float bill = pnclCost+pnCost+ersrCost;
        System.out.println(bill);
    }

}    

