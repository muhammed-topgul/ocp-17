package c05.declaring_local_and_instance_variables.local_variable_modifiers;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 20:32
 */
public class Animal {
    private String name;

    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        final int rest1;
        if (isWeekend) {
            rest = 5;
            rest1 = 10;
        } else {
            rest = 20;
        }
        System.out.println(rest);
        // System.out.println(rest1);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

        // rest = 10;              // DOES NOT COMPILE
        // giraffe = new Animal(); // DOES NOT COMPILE
        // friends = null;         // DOES NOT COMPILE

        giraffe.name = "George";
        friends[2] = 2;
    }
}
