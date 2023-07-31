package c03.creating_decision_making_statements;

/**
 * @author muhammed-topgul
 * @since 31/07/2023 08:10
 */
public class PatternMatching {
    public static void main(String[] args) {
        instanceOfBeforeJava16(1);
        instanceOfAfterJava16(5);

        printIntegersGraterThan5(4);
        printIntegersGraterThan5(6);
        printIntegersGraterThan5(6.0D);
    }

    private static void printIntegersGraterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.println("Number is an integer and greater than 5.");
        } else {
            System.out.println("Else statement");
        }
    }

    private static void instanceOfAfterJava16(Number number) {
        if (number instanceof Integer data) {
            // data = 4; // BAD PRACTICE
            System.out.println("Number is an integer");
            System.out.println(data.compareTo(1));
        } else if (number instanceof final Double data) {
            // data = 4.4; // DOES NOT COMPILE
            System.out.println("Number is an integer");
            System.out.println(data.compareTo(1.0));
        } else {
            System.out.println("Else statement");
        }
    }

    private static void instanceOfBeforeJava16(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println("Number is an integer");
            System.out.println(data.compareTo(1));
        } else {
            System.out.println("Else statement");
        }
    }
}
