import java.util.*;
public class NumArr {//Assignment question 1
    public static void main(String args[]){
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//size of array
        int nums[]=new int[n];
        if(n>0&&n<Math.pow(10,5));
        {
        for(int i=0;i<nums.length;i++){
            
            nums[i]=sc.nextInt();
            if(nums[i]>=Math.pow(10,-9)&&nums[i]<=Math.pow(10,9)==false){
                System.out.println("Invalid input and output");
                break;
            }

        }
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
        sc.close();
    
    }
    }
    
}
