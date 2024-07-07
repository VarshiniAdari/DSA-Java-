import java.util.*;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Vizag");
        cities.add("Bengaluru");
        System.out.println(cities);
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("Mumbai");
        city.add("Delhi");
        city.add("Hyderabad");
        city.add("Chennai");
        city.add("Vizag");
        city.add("Bengaluru");
        System.out.println(city);//order
    }
}
