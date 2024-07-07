// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class SortAL {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        //Ascending order
        System.out.println("Ascending order");
        Collections.sort(list);
        System.out.println(list);
        //descending order
        System.out.println("Descending order");
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
    
}
