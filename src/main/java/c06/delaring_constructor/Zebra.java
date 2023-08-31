package c06.delaring_constructor;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 14:45
 */
public class Zebra extends Animal {
    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }

    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }
}