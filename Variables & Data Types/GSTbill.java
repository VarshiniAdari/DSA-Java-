import java.util.*;
public class GSTbill {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pnclCost = sc.nextFloat();
        float pnCost = sc.nextFloat();
        float ersrCost = sc.nextFloat();
        sc.close();
        float tot=pnclCost+pnCost+ersrCost;
        float tax=(18*tot)/100;
        float bill = tot+tax;
        System.out.println(bill);
    }
}
