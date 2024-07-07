import java.util.*;
public class ChocolaProblem {
    public static void main(String[] args) {
        // int n=4,m=6;
        Integer costhor[]={4,1,2};//n-1
        Integer costver[]={2,1,3,1,4};//m-1
        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());
        int h=0,v=0;//pointers
        int hp=1,vp=1;//pieces tracker
        int cost=0;
        while(h<costhor.length&&v<costver.length){
            if(costhor[h]>=costver[v]){//horizontal cut
                cost+=(costhor[h]*vp);
                h++;
                hp++;
            }else{//vertical cut
                cost+=(costver[v]*hp);
                v++;
                vp++;
            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            h++;
            hp++;
        }
        while(v<costver.length){
            cost+=(costver[v]*hp);
            v++;
            vp++;           
        }
        System.out.println("Cost = "+cost);
    }
}