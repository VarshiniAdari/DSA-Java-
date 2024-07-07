import java.util.*;
public class BinDec {
    public static int BinToDec(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int LstDig=n%10;
            dec+=LstDig*Math.pow(2,pow);
            n=n/10;
            pow++;
        }
        return dec;
    }
    public static int DecToBin(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            int dig=n%2;
            bin+=dig*Math.pow(10,pow);
            n/=2;
            pow++;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number");
       
        int BinNum=sc.nextInt();
        System.out.println("Enter a decimal number");
        int decNum=sc.nextInt();
        
        System.out.println("The number "+decNum+" in binary = "+DecToBin(decNum));

        System.out.println("The number"+BinNum+" in decimal= "+BinToDec(BinNum));
       
        sc.close();
    }
    
}
