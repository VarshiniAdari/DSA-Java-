public class Transpose {
    public static void transpose(int nums[][]){
        int numsT[][] = new int[nums[0].length][nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                numsT[j][i]=nums[i][j];
            }
        }
            for(int i=0;i<numsT.length;i++){
                for(int j=0;j<numsT[0].length;j++){
                    System.out.print(numsT[i][j]+"   ");
                }
                System.out.println();
            }
            return;
        
    }
    public static void main(String args[]){
        int nums[][]={{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
        transpose(nums);
    }
    
}
