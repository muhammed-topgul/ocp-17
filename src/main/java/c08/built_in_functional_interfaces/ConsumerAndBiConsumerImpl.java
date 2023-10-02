package c08.built_in_functional_interfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 14:54
 */
public class ConsumerAndBiConsumerImpl {
    public static void main(String[] args) {
        {
            Consumer<String> c1 = System.out::println;
            Consumer<String> c2 = x -> System.out.println(x);
            c1.accept("Java SE17");
            c2.accept("Spring Boot");
        }
        {
            var map = new HashMap<String, Integer>();
            BiConsumer<String, Integer> b1 = map::put;
            BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
            b1.accept("chicken", 7);
            b2.accept("chick", 1);
            System.out.println(map);
        }
    }
}
