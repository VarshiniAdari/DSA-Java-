public class SumInARow {
    public static void getSum(int nums[][]){
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        getSum(nums);
    }
    
}
