//this code works only if end array is sorted
//this logic works only if 1st activity is selected
// int start[]={0,4,3};
// int end[]={5,6,6};
//logic won't work for above arrays
import java.util.*;
public class ActivitySelectionSorted{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        //end time based sorted
        int maxAct=0;//maximum activities count
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastEnd){
                //select activity
                maxAct++;
                ans.add(i); 
                lastEnd=end[i];
            }
        }//O(n)
        System.out.println("Maximum activities ="+maxAct);
        for(int i=0;i<maxAct;i++){
            System.out.println("Activity "+ans.get(i));
        }
    }
} 