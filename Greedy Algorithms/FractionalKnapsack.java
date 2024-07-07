import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[value.length][2];
        //0th index store idx and 1st index store ratio
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=W;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                //include total item
                capacity-=weight[idx];
                finalVal+=value[idx];
                // System.out.println("If "+finalVal);
            }
            else{
                //include fraction
                finalVal+=ratio[i][1]*capacity;
                capacity=0;
                // System.out.println("else "+finalVal);
                break;
            }
        }
        System.out.println("Final value = "+finalVal);
    }
}
