import java.util.*;
public class HashSetIterations2 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Vizag");
        cities.add("Bengaluru");
        for(String city:cities){
            System.out.println(city);
        }
    }
}