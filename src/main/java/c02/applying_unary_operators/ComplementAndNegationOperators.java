package c02.applying_unary_operators;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 13:13
 */
public class ComplementAndNegationOperators {
    public static void main(String[] args) {
        // complement operator (!)
        boolean isAnimalSleep = false;
        System.out.println(isAnimalSleep); // false

        isAnimalSleep = !isAnimalSleep;
        System.out.println(isAnimalSleep); // true

        // bitwise complement operator (~)
        int value = 3;                  // Stored as 0011
        int complement = ~value;        // Stored as 1100
        System.out.println(value);      // 3
        System.out.println(complement); // -4
        System.out.println(-1 * value - 1);    // -4
        System.out.println(-1* complement -1); // 3

        // int pelican = !5; // DOES NOT COMPILE
        // boolean penguin = -true; // DOES NOT COMPILE
        // boolean peacock = !0; // DOES NOT COMPILE
    }
}
