package c08.built_in_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 15:37
 */
public class ConvenienceMethods {
    public static void main(String[] args) {
        {
            Predicate<String> egg = s -> s.contains("egg");
            Predicate<String> brown = s -> s.contains("brown");

            Predicate<String> brownEggs1 = s -> s.contains("egg") && s.contains("brown");
            Predicate<String> otherEggs1 = s -> s.contains("egg") && !s.contains("brown");

            Predicate<String> brownEggs2 = s -> egg.test(s) && brown.test(s);
            Predicate<String> otherEggs2 = s -> egg.test(s) && !brown.test(s);

            Predicate<String> brownEggs3 = egg.and(brown);
            Predicate<String> otherEggs3 = egg.and(brown.negate());

            System.out.println(brownEggs3.test("brown-eggs"));
            System.out.println(otherEggs3.test("red-eggs"));
        }

        {
            Consumer<String> c1 = x -> System.out.print("1: " + x);
            Consumer<String> c2 = x -> System.out.print(" ,2: " + x);

            Consumer<String> combined = c1.andThen(c2);
            combined.accept("Java");
        }

        {
            System.out.println();
            Function<Integer, Integer> before = x -> x + 1;
            Function<Integer, Integer> after = x -> x * 2;

            Function<Integer, Integer> combined = after.compose(before);
            System.out.println(combined.apply(3)); // 8
        }
    }
}
