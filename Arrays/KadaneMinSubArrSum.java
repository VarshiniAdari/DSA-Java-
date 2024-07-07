public class KadaneMinSubArrSum {
   
    public static void kadane(int numbers[]){
        int posMS=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<posMS){
                posMS=numbers[i];
            }
            if(numbers[i]<0){
                negKadane(numbers);
                break;
            }
            if(i==(numbers.length-1)){
                System.out.println("Maximum sum is: "+posMS);
            }
        }

    }
    public static void negKadane(int numbers[]){
            int cs=0;//current sum
            int ms=Integer.MAX_VALUE;
            for(int i=0;i<numbers.length;i++){
                cs=cs+numbers[i];
                if(cs>0){
                    cs=0;
                }
                ms=Math.min(cs,ms);
            }
            System.out.println("Minimum sum is: "+ms);
            //However,this algorithm wont work if all the numbers in the array are positive. See kadane2.java file
        }
        public static void main(String args[]){
            int numbers[]={-2,-3,4,-1,-2,1,5,-3};
            kadane(numbers);
        }     
}