package c06.abstract_classes;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 16:40
 */
abstract class Mammal {
    abstract CharSequence chew();

    String sound() {
        return "Mammal sound";
    }

    public Mammal() {
        System.out.println(chew()); // Does this line compile?
        System.out.println(sound());
    }
}
