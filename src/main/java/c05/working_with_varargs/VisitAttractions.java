package c05.working_with_varargs;

import java.util.Arrays;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 20:51
 */
public class VisitAttractions {
    public void walk1(int... steps) {
        System.out.println(steps.length);
        System.out.println(steps.getClass());
        System.out.println(Arrays.toString(steps));
        System.out.println();
    }

    public void walk2(int start, int... steps) {
        System.out.println(steps.length);
    }

    // public void walk3(int...steps, int start) {}      // DOES NOT COMPILE

    // public void walk4(int... starts, int... steps) {} // DOES NOT COMPILE

    public static void main(String[] args) {
        VisitAttractions visitAttractions = new VisitAttractions();
        int[] data = new int[]{1, 2, 3};
        visitAttractions.walk1();
        visitAttractions.walk1(data);
        visitAttractions.walk1(1, 2, 3);

        visitAttractions.walk2(1);                 // 0
        visitAttractions.walk2(1, 2);     // 1
        visitAttractions.walk2(1, 2, 3);  // 2
        visitAttractions.walk2(1, new int[]{1, 2}); // 2
    }
}
