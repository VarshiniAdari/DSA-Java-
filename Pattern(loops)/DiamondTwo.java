import java.util.*;

public class DiamondTwo{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp=n/2;
        int nspl = 0;
        int nstl = n;
        if(n>=1&&n<=100&&n%2!=0)
        {
            for(int i=1;i<=n;i++)
            {
                if(i<=n/2)
                {
                    for(int sp = nsp; sp>=1;sp--)
                    {
                        System.out.print(" ");
                    }
                    for(int st = 1;st<=nst;st++)
                    {
                        System.out.print("*");
                    }
                    nsp--;
                    nst+=2;
                }
                else
                {
                    for(int sp = 1;sp<=nspl;sp++)
                    {
                        System.out.print(" ");
                    }
                    for(int st = 1;st<=nstl;st++)
                    {
                        System.out.print("*");
                    }
                    
                    nstl-=2;
                    nspl++;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
