package c03.creating_decision_making_statements;

/**
 * @author muhammed-topgul
 * @since 31/07/2023 08:32
 */
public class FlowScoping {
    public static void main(String[] args) {
        printOnlyIntegers(4);
        printOnlyIntegers(4D);
    }

    private static void printIntegersOrNumbersGreaterThan5(Number number) {
        // if (number instanceof Integer data || data.compareTo(5) > 0) // DOES NOT COMPILE
        // System.out.print(data);
    }

    private static void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.println(data.intValue());
        // System.out.println(data.intValue()); // // DOES NOT COMPILE
    }

    private static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        } else {
            System.out.println(data.intValue()); // DOES COMPILE
        }
        System.out.println(data.intValue()); // DOES COMPILE
    }
}
