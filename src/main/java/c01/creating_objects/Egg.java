package c01.creating_objects;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 21:58
 */
public class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;
    {
        number = 4;
    }
}
