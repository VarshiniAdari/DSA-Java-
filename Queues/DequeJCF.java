import java.util.*;
public class DequeJCF {
    public static void main(String[] args){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(0);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        dq.addFirst(0);
        dq.addLast(100);
        System.out.println(dq);
        System.out.println("1st el = "+dq.getFirst());
        System.out.println("Last el = "+dq.getLast());
        
    }
}
