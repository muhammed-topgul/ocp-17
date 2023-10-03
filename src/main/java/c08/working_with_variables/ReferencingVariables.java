package c08.working_with_variables;

import java.util.function.Consumer;

/**
 * @author muhammed-topgul
 * @since 03/10/2023 10:21
 */
public class ReferencingVariables {
    private String color;

    public void caw(String name) {
        String volume = "loudly";

        // name = "Caty";      // DOES NOT COMPILE
        // volume = "softly";  // DOES NOT COMPILE
        color = "black";

        Consumer<String> consumer = s ->
                System.out.println(name + " says " + volume + " that she is " + color);
        consumer.accept(name);
    }

    public static void main(String[] args) {
        new ReferencingVariables().caw("Muhammed");
    }
}
