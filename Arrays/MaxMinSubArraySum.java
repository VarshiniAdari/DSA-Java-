public class MaxMinSubArraySum {//brute force code
    public static void SumSubArray(int numbers[]){
        int sumArrLen=numbers.length*(numbers.length+1)/2;//you can just use a single variable maxSum,minSum instead
        int sum[]=new int[sumArrLen];//in this code you can also hava the sub array sum in another array
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0 ; i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum[i]=0;
                for(int k=i;k<=j;k++){
                     sum[i]+=numbers[k];
                }
                if(sum[i]>largest)
                {
                    largest=sum[i];
                } 
                if(sum[i]<smallest){
                    smallest=sum[i];
                }   
            }
        }
        System.out.println("Maximum array sum is "+largest+" Minimum array sum is "+smallest);

        return;
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        SumSubArray(numbers);
    }
    
}
