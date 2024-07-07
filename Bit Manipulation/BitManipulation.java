public class BitManipulation {
    /*Different codes 
    1.Get ith bit
    2.Set ith bit
    3.Clear ith bit
    4.Update ith bit
    5.Clear last i bits
    6.Clear range of bits*/
    public static void main(String args[]){
        System.out.println("Get ith bit : "+getIthBit(10,1 ));
        System.out.println("Set ith bit : "+setIthBit(10,0));
        System.out.println("Clear ith bit : "+clearIthBit(10,1));
        System.out.println("Update ith bit : "+UpdateIthBit(10,2 ,1 ));
        System.out.println("Clear last i bits : "+clearLastIbits(15, 2));
        System.out.println("Clear bits in a Rangefrom (j(higher index) to i(lower index)) : "+clearRangeOfBits(15,2 ,4 ));
    }
    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        } 
    }
    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        n=n|bitMask;
        return n;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        n=n&bitMask;
        return n;
    }
    public static int UpdateIthBit(int n, int i,int newBit){
        clearIthBit(n,i);
        n=n|(newBit<<i);
        return n;
    }
    public static int clearLastIbits(int n,int i){
        int bitMask=(~0)<<i;
        n=n&bitMask;
        return n;
    }
    public static int clearRangeOfBits(int n, int i, int j){// i - lower index value , j - higher index value
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        n=n&bitMask;
        return n;

    }
    
}
