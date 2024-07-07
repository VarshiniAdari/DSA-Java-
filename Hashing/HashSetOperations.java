import java.util.*;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(1);
        System.out.println(set);
        if(set.contains(2)){
            System.out.println("Set has 2");
        }
        if(set.contains(3)){
            System.out.println("Set has 3");
        }
        System.out.println(set.remove(2));
        if(set.contains(2)){
            System.out.println("Set has 2");
        }else{
            System.out.println("There is no 2");
        }
        System.out.println(set);
        System.out.println("Size of set is "+set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println("Size is "+set.size());
        System.out.println(set.isEmpty());
    }
}
