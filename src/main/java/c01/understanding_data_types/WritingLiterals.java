package c01.understanding_data_types;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 22:09
 */
public class WritingLiterals {
    public static void main(String[] args) {
        // By default, Java assumes you are defining an int value with a numeric literal.
        // long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L; // DOES COMPILE

        int octal = 017;        // 15
        int hexadecimal = 0xFF; // 255
        int binary = 0b10;      // 2
    }
}
