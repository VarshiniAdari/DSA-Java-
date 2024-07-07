import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={5,3,5,1,0,8};
        int end[]={7,4,9,2,6,9};

        int activities[][]=new int[start.length][3];
        //0th col -> activity index
        //1st col -> start time
        //2nd col -> end time
        for(int i=0;i<end.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //sorting
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        maxAct++;
        for(int i=1;i<activities.length;i++){
            if(activities[i][1]>=lastEnd){
                //select activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Maximum number of activities = "+maxAct);
        for(int i=0;i<maxAct;i++){
            System.out.println("Activity"+ans.get(i));
        }

    }
}
