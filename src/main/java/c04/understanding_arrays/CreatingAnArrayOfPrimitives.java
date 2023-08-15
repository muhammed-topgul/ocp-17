package c04.understanding_arrays;

import java.util.Arrays;

/**
 * @author muhammed-topgul
 * @since 15/08/2023 16:10
 */
public class CreatingAnArrayOfPrimitives {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0]

        int[] moreNumbers = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(moreNumbers)); // [1, 2, 3]

        int[] moreNumbers1 = {1, 2, 3};
        System.out.println(Arrays.toString(moreNumbers)); // [1, 2, 3]

        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        // Multiple “Arrays” in Declarations
        {
            int[] ids, types; // Both array
        }

        {
            int ids[], types; // Only ids array
        }
    }
}
