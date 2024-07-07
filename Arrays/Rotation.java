import java.util.*;
public class Rotation {//brute force
    public static void rotate(int[] nums,int pivot,int target){
        int newNums[]=new int[nums.length];
        int j=0;
        for(int i=pivot;i<nums.length;i++){
            newNums[j]=nums[i];
            j++;
        }
        for(int i=0;i<pivot;i++){
            newNums[j]=nums[i];
            j++;
        }
        System.out.println("After rotation at "+pivot);
        int index=-1;
        for(int i=0;i<nums.length;i++){
            System.out.print(newNums[i]+"   ");
            if(newNums[i]==target){
                index=i;
            }
        }
        System.out.println("Target output "+index);
        
    }

    
    public static void main(String args[]){
        int nums[]={0,1,2,4,5,6,7};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter where to rotate");
        int pivot=sc.nextInt();
        System.out.println("Enter target");
        int target=sc.nextInt();
        rotate(nums,pivot,target);
        
        sc.close();
    }
    
}
