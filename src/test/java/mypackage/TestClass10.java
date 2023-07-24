package mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClass10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());

        System.out.println(map.containsKey(90));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        System.out.println();
        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Vova", "Zver");
        map2.put("Khvan", "Mashina");
        System.out.println(map2.get("Vova"));
    }
}
