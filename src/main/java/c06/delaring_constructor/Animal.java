package c06.delaring_constructor;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 14:44
 */
public class Animal {
    private int age;

    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }
}