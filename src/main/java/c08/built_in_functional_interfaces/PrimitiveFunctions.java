package c08.built_in_functional_interfaces;

import java.util.function.BooleanSupplier;

/**
 * @author muhammed-topgul
 * @since 03/10/2023 08:05
 */
public class PrimitiveFunctions {
    public static void main(String[] args) {
        {
            BooleanSupplier b1 = () -> true;
            BooleanSupplier b2 = () -> Math.random() > .5;
            System.out.println(b1.getAsBoolean());
            System.out.println(b2.getAsBoolean());
        }
    }
}
