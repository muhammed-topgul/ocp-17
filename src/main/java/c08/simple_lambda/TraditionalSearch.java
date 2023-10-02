package c08.simple_lambda;

import java.util.*;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 08:57
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
        print(animals, new CheckTrait() {
            @Override
            public boolean test(Animal animal) {
                return animal.canHop();
            }
        });
        print(animals, a -> a.canHop());
        print(animals, Animal::canSwim);
        print(animals, a -> !a.canHop());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // General check
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
