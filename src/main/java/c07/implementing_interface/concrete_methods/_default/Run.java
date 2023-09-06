package c07.implementing_interface.concrete_methods._default;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:29
 */
public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
