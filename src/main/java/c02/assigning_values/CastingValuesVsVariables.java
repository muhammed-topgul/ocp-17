package c02.assigning_values;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 23:45
 */
public class CastingValuesVsVariables {
    public static void main(String[] args) {
        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

        // short boots = 2 + hat;            // DOES NOT COMPILE
        // byte gloves2 = (byte) (7 * 100);  // DOES NOT COMPILE
    }
}
