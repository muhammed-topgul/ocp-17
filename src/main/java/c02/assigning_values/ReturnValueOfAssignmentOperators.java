package c02.assigning_values;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 23:55
 */
public class ReturnValueOfAssignmentOperators {
    public static void main(String[] args) {
        long wolf = 5;
        long coyote = wolf = 3;

        System.out.println(wolf);
        System.out.println(coyote);

        boolean healthy = false;
        if(healthy = true)
            System.out.print("Good!"); // prints
        else
            System.out.println("Not Good!");
    }
}
