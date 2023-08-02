package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 02/08/2023 12:28
 */
public class ReturningConsistentDataTypes {
    public static void main(String[] args) {
        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            // case 15 -> (long) 12; // DOES NOT COMPILE
            // case 20 -> "3";       // DOES NOT COMPILE
            // case 25 -> 4L;        // DOES NOT COMPILE
            // case 30 -> null;      // DOES NOT COMPILE
            default -> 5;
        };
    }
}
