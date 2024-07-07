import java.util.*;
public class Table {
    public static void main(String args[])
    {
        System.out.println("Whose table you want rey?");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=20;i++)
        {
            int val=n*i;
            System.out.println(n+"*"+i+"="+val);
        }
    sc.close();
    }
    
}
