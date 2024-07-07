import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Vizag");
        cities.add("Bengaluru");
        System.out.println("HashSet:");
        System.out.println(cities);
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("Mumbai");
        city.add("Delhi");
        city.add("Hyderabad");
        city.add("Chennai");
        city.add("Vizag");
        city.add("Bengaluru");
        System.out.println("LinkedHashSet");
        System.out.println(city);//order
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Hyderabad");
        ts.add("Chennai");
        ts.add("Vizag");
        ts.add("Bengaluru");
        System.out.println("TreeSet:");
        System.out.println(ts);
    }
}
