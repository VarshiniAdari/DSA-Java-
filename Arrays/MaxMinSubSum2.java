public class MaxMinSubSum2 {
    public static void printSubArraySumMaxMin(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
       
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(currSum>largest){
                    largest=currSum;
                }
                if(currSum<smallest){
                    smallest=currSum;
                }
            }
        }
        System.out.println("Largest sub array sum is: "+largest);
        System.out.println("Smallest sub array sum is: "+smallest);
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5};
        printSubArraySumMaxMin(numbers);
    }
    
}
