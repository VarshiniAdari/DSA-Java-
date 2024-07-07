import java.util.*;
public class NRopes {
    public static void main(String[] args) {
        int ropes1[]={2,3,3,4,6};
        int ropes2[]={4,3,2,6};
        System.out.println(findMinCost(ropes1));
        System.out.println(findMinCost(ropes2));
    }
    public static int  findMinCost(int ropes[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int minCost=0;
        while(pq.size()>1){
            int min1=pq.remove();
            int min2=pq.remove();
            minCost+=min1+min2;
            pq.add(min1+min2);
        }

        return minCost;
    }
    
    
}
