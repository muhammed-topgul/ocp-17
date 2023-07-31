package c03.creating_decision_making_statements;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 31/07/2023 08:24
 */
public class PatternMatchingSubtypes {
    public static void main(String[] args) {
        Integer value = 123;

        if (value instanceof Integer) {}
        // if (value instanceof Integer data) {} // DOES NOT COMPILE


        BigDecimal bigDecimal = new BigDecimal("1");
        if (bigDecimal instanceof List) {}
        if (bigDecimal instanceof List data) {}

        Number number = 1;
        if (number instanceof List) {}
        if (number instanceof List data) {}

        Integer integer = 1;
        // if (integer instanceof List) {}      // DOES NOT COMPILE
        // if (integer instanceof List data) {} // DOES NOT COMPILE
    }
}
