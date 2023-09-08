package c07.polymorphism.casting_objects;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 12:22
 */
public class CastingInterfaces {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Dog badWolf = (Dog) wolf; // java.lang.ClassCastException

        if (wolf instanceof Dog) {} // COMPILE
    }
}

interface Canine {
}

interface Dog {
}

class Wolf implements Canine {
}