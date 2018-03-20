package zadanie6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zadanie6 {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Patryk");
        myMap.put(2, "Tomek");
        myMap.put(3, "Krzysiek");
        myMap.put(4, "Ola");

        System.out.println(myMap);
        System.out.print(Zadanie6.invert(myMap));

    }

    public static Map<String, Integer> invert(Map<Integer, String> map) {
        Map temp = new HashMap();

        for (Integer integer : map.keySet()) {
            map.get(integer);
            temp.put(map.get(integer), integer);
        }
        return temp;
    }
}
