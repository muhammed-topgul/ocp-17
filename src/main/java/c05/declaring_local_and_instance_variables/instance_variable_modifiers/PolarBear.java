package c05.declaring_local_and_instance_variables.instance_variable_modifiers;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 20:47
 */
public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;

    {
        fishEaten = 10;
    }

    public PolarBear() {
        name = "Robert";
    }
}
