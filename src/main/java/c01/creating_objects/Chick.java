package c01.creating_objects;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 21:42
 */
public class Chick {
    private String name = "Fluffy";

    // Instance initializer
    {
        System.out.println("Setting field");
        System.out.println(name);
    }

    public Chick() { // A CONSTRUCTOR
        name = "Tiny";
        System.out.println("Setting constructor");
    }

    public void Chick() { // NOT A CONSTRUCTOR
    }


    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
