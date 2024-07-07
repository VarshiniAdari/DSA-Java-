public class PrefixSubArr {
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
        for(int i=0;i<prefix.length;i++){
            int currSum=0;
            for(int j=i;j<prefix.length;j++){
                currSum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(currSum);
            }
        }
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        subArrPrefix(numbers);
    }
    
}
