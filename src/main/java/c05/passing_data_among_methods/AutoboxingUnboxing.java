package c05.passing_data_among_methods;

/**
 * @author muhammed-topgul
 * @since 28/08/2023 00:31
 */
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int quack = 5;

        // Manual boxing-unboxing
        {
            Integer quackBoxing = Integer.valueOf(quack);
            System.out.println(quackBoxing);
            int quackUnboxing = quackBoxing.intValue();
            System.out.println(quackUnboxing);
        }

        {
            Integer quackAutoboxing = 5;
            System.out.println(quackAutoboxing);
            int quackUnboxing = quackAutoboxing;
            System.out.println(quackUnboxing);
        }

        {
            Short tail = 8; // Autoboxing
            Character p = Character.valueOf('p');
            char paw = p; // Unboxing
            Boolean nose = true; // Autoboxing
            Integer e = Integer.valueOf(9);
            long ears = e; // Unboxing, then implicit casting
        }

        {
            // Long badGorilla = 8; // DOES NOT COMPILE
            Character elephant = null;
            char badElephant = elephant;
        }
    }
}
