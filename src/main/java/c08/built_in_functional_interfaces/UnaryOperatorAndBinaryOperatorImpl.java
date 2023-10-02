package c08.built_in_functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 15:16
 */
public class UnaryOperatorAndBinaryOperatorImpl {
    public static void main(String[] args) {
        {
            UnaryOperator<String> u1 = String::toUpperCase;
            UnaryOperator<String> u2 = x -> x.toUpperCase();
            System.out.println(u1.apply("chirp"));
            System.out.println(u2.apply("chirp"));
        }
        {
            BinaryOperator<String> b1 = String::concat;
            BinaryOperator<String> b2 = (s1, s2) -> s1.concat(s2);
            System.out.println(b1.apply("Java", "SE"));
            System.out.println(b2.apply("Java", "SE"));
        }
    }
}
