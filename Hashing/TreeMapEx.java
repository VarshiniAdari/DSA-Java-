import java.util.*;
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);
        System.out.println(tm);//keys in alphabetical order
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
    }
}
