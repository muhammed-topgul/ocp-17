package c07.implementing_interface.declaring_and_using;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:18
 */
public abstract interface CanBurrow {
    public static final int  MIN_DEPTH = 2;

    public abstract Float getSpeed(int age);
}
