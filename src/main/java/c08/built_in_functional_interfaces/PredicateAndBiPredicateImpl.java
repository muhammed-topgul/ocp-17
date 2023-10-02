package c08.built_in_functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 15:06
 */
public class PredicateAndBiPredicateImpl {
    public static void main(String[] args) {
        {
            Predicate<String> p1 = String::isEmpty;
            Predicate<String> p2 = x -> x.isEmpty();
            System.out.println(p1.test(" "));
            System.out.println(p2.test(""));
        }
        {
            BiPredicate<String, String> b1 = String::startsWith;
            BiPredicate<String, String> b2 = (text, prefix) -> text.startsWith(prefix);
            System.out.println(b1.test("chicken", "chick"));
            System.out.println(b2.test("chicken", "chick"));
        }
    }
}
