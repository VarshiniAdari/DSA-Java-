import java.util.*;
public class HashSetIterations1 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Vizag");
        cities.add("Bengaluru");
        Iterator<String> it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
