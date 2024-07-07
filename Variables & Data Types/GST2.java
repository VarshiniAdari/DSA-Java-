import java.util.*;
public class GST2 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pnclCost = sc.nextFloat();
        float pnCost = sc.nextFloat();
        float ersrCost = sc.nextFloat();
        sc.close();
        float pnclTax=18*pnclCost/100;
        float pnTax=18*pnCost/100;
        float ersrTax=18*ersrCost/100;
        pnclCost=pnclCost+pnclTax;
        pnCost=pnCost+pnTax;
        ersrCost=ersrCost+ersrTax;
        System.out.println(pnclCost);
        System.out.println(pnCost);
        System.out.println(ersrCost);
        float bill = pnclCost+pnCost+ersrCost;
        System.out.println(bill);

    }
}
