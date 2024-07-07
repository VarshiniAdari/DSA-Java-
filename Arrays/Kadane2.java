public class Kadane2 {
    public static void kadane(int numbers[]){
        int negMS=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>negMS){
                negMS=numbers[i];
            }
            if(numbers[i]>0){
                posKadane(numbers);
                break;
            }
            if(i==(numbers.length-1)){
                System.out.println("Maximum sum is: "+negMS);
            }
        }
        return;
    }
    public static void posKadane(int numbers[]){
        int cs=0;//current sum
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum is: "+ms);
    }
    public static void main(String args[]){
        int numbers[]={-1,-2,-4,-5,-9};
        kadane(numbers);
    }
}
