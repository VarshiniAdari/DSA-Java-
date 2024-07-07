public class KadaneMaxSubArrSum {
    public static void kadane(int numbers[]){
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
        //However,this algorithm wont work if all the numbers in the array are negative. See kadane2.java file
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
    
}
