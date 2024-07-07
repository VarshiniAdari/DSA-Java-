//Assignment question 2
public class SearchRotation {
    public static void search(int nums[],int target){
        
        if(target>nums[nums.length-1]){
           search(nums,target,0,minsearch(nums));
        }
        else{
            search(nums,target,minsearch(nums),nums.length-1);
        }
        
    }
    public static int search(int nums[],int target,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            return -1;
        }

    }
    public static int minsearch(int nums[]){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid-1]){
                return mid;
            }
            else if(nums[mid]>=nums[left]&&nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        search(nums,target);
    }
}
