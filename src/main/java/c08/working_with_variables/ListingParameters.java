package c08.working_with_variables;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author muhammed-topgul
 * @since 03/10/2023 10:04
 */
public class ListingParameters {
    public static void main(String[] args) {
        {
            new ListingParameters().whatAmI();
        }
        {
            Predicate<Integer> p1 = a -> {
                int b = 0;
                int c = 0;
                return b == a + b;
            };
        }
    }

    private void whatAmI() {
        consume((var x) -> System.out.println(x), 123);
    }

    private void consume(Consumer<Integer> consumer, int number) {
        consumer.accept(number);
    }

    private void counts(List<Integer> list) {
        list.sort(Integer::compareTo);
        list.sort((var x, var y) -> x.compareTo(y));
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
    }
}
