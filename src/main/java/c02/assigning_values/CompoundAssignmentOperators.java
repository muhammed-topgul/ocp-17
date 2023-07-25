package c02.assigning_values;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 23:49
 */
public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe;  // Simple assignment operator
        camel *= giraffe;         // Compound assignment operator
        System.out.println(camel);


        long goat = 10;
        int sheep = 5;
        // sheep = sheep * goat; // DOES NOT COMPILE
        sheep *= goat;
        System.out.println(sheep);
    }
}
