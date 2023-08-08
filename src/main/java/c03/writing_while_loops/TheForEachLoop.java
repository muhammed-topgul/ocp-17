package c03.writing_while_loops;

import java.util.Arrays;

/**
 * @author muhammed-topgul
 * @since 08/08/2023 15:58
 */
public class TheForEachLoop {
    public static void main(String[] args) {
        String [] names = new String[] {
                "John",
                "Sam",
                "Clara"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : Arrays.asList(names)) {
            System.out.println(name);
        }

//        String[] sloths = new String[3];
//        for(int sloth : sloths) // DOES NOT COMPILE
//            System.out.print(sloth + " ");
    }
}
