package c01.understanding_data_types;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 22:16
 */
public class LiteralAndTheUnderscoreCharacter {
    public static void main(String[] args) {
        int million1 = 1000000;
        int million2 = 1_000_000;

        // double notAtStart = _100.00; // DOES NOT COMPILE
        // double notAtEnd = 100.00_; // DOES NOT COMPILE
        // double notByDecimal = 100_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // Ugly but legal
        double reallyUgly = 1_______________2; // Also comples
    }
}
