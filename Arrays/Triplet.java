import java.util.*;
public class Triplet {//brute force
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[]=new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=(nums[i]+nums[j]+nums[k]);
                    if(sum==0){
                        System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                    }
                }
                sc.close();
            }
        }
    }
    
}
