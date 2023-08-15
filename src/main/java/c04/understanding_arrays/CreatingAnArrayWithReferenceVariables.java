package c04.understanding_arrays;

import java.util.Arrays;

/**
 * @author muhammed-topgul
 * @since 15/08/2023 16:17
 */
public class CreatingAnArrayWithReferenceVariables {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        alias[0] = "donkey";

        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());

        {
            String[] strings = {"stringValue"};
            Object[] objects = strings;
            String[] againStrings = (String[]) objects;
            // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
            objects[0] = new StringBuilder(); // Careful!
        }
    }
}
