package c02.comparing_values;

/**
 * @author muhammed-topgul
 * @since 28/07/2023 09:32
 */
public class CheckingForUnperformedSideEffects {
    public static void main(String[] args) {
        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(bunny);
        System.out.println(rabbit);

        bunny = (rabbit > 6) || (++rabbit == 7);
        System.out.println(bunny);
        System.out.println(rabbit);
    }
}
