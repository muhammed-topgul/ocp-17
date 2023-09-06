package c07.implementing_interface.implicit_modifiers;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:55
 */
public interface Soar2 {
    public static final int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;

    public abstract void fly(int speed);

    public abstract void takeOff();

    public abstract double dive();
}
