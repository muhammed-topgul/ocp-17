package c09.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 04/10/2023 13:30
 */
public class ListWithFactory {
    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copyOf = List.copyOf(of);
        array[2] = "Y";

        {
            // Arrays.asList()
            System.out.println("\n# Arrays.asList(varargs)");
            // asList.add("D");  // java.lang.UnsupportedOperationException
            // asList.remove(0); // java.lang.UnsupportedOperationException
            asList.set(1, "X");
            System.out.println(asList); // [A, X, Y]
        }

        {
            // List.of(varargs)
            System.out.println("\n# List.of(varargs)");
            // of.add("D");    // java.lang.UnsupportedOperationException
            // of.remove(1);   // java.lang.UnsupportedOperationException
            // of.set(1, "X"); // java.lang.UnsupportedOperationException
            System.out.println(of);  // [A, B, C]
        }

        {
            // List.of(varargs)
            System.out.println("\n# List.copyOf(collection)");
            // copyOf.add("D");    // java.lang.UnsupportedOperationException
            // copyOf.remove(1);   // java.lang.UnsupportedOperationException
            // copyOf.set(1, "X"); // java.lang.UnsupportedOperationException
            System.out.println(copyOf);  // [A, B, C]
        }
    }
}
