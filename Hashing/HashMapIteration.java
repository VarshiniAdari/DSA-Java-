import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);
        hm.put("Indonesia",4);
        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);//random order
        //Printing with value
        for (String k : keys) {
            System.out.println("Key="+k+"   Value="+hm.get(k));
        }

    }
}
