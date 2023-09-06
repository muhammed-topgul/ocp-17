package c07.implementing_interface.concrete_methods._default;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:16
 */
public interface IsColdBlooded {
    private void info() {
        System.out.println("I am the info()");
    }

    boolean hasScales();

    default public double getTemperature() {
        return 10.1;
    }

    // public default void eatMeat(); // DOES NOT COMPILE
    // public void getRequiredFoodAmount() {} // DOES NOT COMPILE
}
