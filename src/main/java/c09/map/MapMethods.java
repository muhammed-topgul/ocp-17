package c09.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author muhammed-topgul
 * @since 05/10/2023 15:38
 */
public class MapMethods {
    public static void main(String[] args) {
        {
            Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
            System.out.println(map);
        }

        {
            Map<String, String> map = Map.ofEntries(
                    Map.entry("key1", "value1"),
                    Map.entry("key2", "value2")
            );
            System.out.println(map);
        }
        {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");

            System.out.println(map.containsKey(2));
            System.out.println(map.containsValue("three"));
            System.out.println(map.entrySet());
            map.forEach((k, v) -> System.out.printf("%d(%s) ", k, v));
            System.out.println();
            System.out.println(map.get(1));
            System.out.println(map.getOrDefault(8, "eight"));
            System.out.println(map.isEmpty());

            System.out.println(map.putIfAbsent(6, "six"));
            System.out.println(map.remove(1));
            map.replace(2, "TWO");
            System.out.println(map);

            map.values().forEach(System.out::println);

            System.out.println("\n");
            map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        }
    }
}
