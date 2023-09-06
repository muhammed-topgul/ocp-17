package c07.implementing_interface.concrete_methods._default;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:28
 */
public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
