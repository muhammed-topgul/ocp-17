package c07.polymorphism.casting_objects;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 12:18
 */
public class DisallowedCast {
    public static void main(String[] args) {
        Fish fish = new Fish();
        // Bird bird = (Bird) fish;  // DOES NOT COMPILE

        // if (fish instanceof Bird) {} // DOES NOT COMPILE
    }
}

class Bird {
}

class Fish {
}
