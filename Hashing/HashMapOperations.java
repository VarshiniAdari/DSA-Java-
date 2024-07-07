import java.util.*;
public class HashMapOperations{
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        //Put O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        //Get O(1)
        int population=hm.get("India");
        System.out.println("India's population="+population);
        System.out.println(hm.get("Indonesia"));
        //containsKey()
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false
        //remove O(1)
        hm.remove("US");
        System.out.println(hm);
        //Size
        System.out.println(hm.size());
        //Clear fn
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}