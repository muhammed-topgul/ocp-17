package c06.abstract_classes;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 16:41
 */
public class Platypus extends Mammal {
    String chew() {
        return "yummy!";
    }

    @Override
    String sound() {
        return "Platypus sound";
    }

    public static void main(String[] args) {
        Platypus platypus = new Platypus();
        System.out.println(platypus.chew());
        System.out.println(platypus.sound());
    }
}
