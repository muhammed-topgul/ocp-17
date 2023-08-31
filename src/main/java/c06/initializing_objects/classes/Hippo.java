package c06.initializing_objects.classes;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 14:56
 */
public class Hippo extends Animal {
    public static void main(String[] args) {
        System.out.println("C");
        new Hippo();
        new Hippo();
    }

    static {
        System.out.println("B");
    }
}
