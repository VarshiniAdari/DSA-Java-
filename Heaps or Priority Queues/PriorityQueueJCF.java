import java.util.*;
public class PriorityQueueJCF{
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // O/P 1 3 4 7
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // O/p 7 4 3 1 
        pq.add(3);//O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(log n)
        }
    }
}