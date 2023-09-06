package c07.implementing_interface.concrete_methods._default;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:19
 */
public class Snake implements IsColdBlooded {
    @Override
    public boolean hasScales() { // Required override
        return true;
    }

    @Override
    public double getTemperature() { // Optional override
        return IsColdBlooded.super.getTemperature();
    }
}
