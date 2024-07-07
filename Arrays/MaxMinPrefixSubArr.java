public class MaxMinPrefixSubArr {
        public static void subArrPrefix(int numbers[]){
            //first find prefix array
            //then calculate sum of sub array using prefix array
            int prefix[]=new int[numbers.length];
            prefix[0]=numbers[0];
            System.out.println("Prefix array is:");
            for(int i=1;i<numbers.length;i++){
                prefix[i]=prefix[i-1]+numbers[i];
                System.out.println(prefix[i]);
            }
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            System.out.println("Sub Array sum calculated using prefix array is displayed below:");
            for(int i=0;i<prefix.length;i++){
                int currSum=0;
                for(int j=i;j<prefix.length;j++){
                    currSum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                    System.out.println(currSum);
                    if(currSum>largest){
                        largest=currSum;
                    }
                    if(currSum<smallest){
                        smallest=currSum;
                    }
                }
            }
            System.out.println("Largest sub array sum is: "+largest+" Smallest sub array sum is: "+smallest);
        }
        public static void main(String args[]){
            int numbers[]={1,-2,6,-1,3};
            subArrPrefix(numbers);
    }
}
