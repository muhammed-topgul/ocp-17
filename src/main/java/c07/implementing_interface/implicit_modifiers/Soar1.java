package c07.implementing_interface.implicit_modifiers;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:55
 */
public interface Soar1 {
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;

    void fly(int speed);

    abstract void takeOff();

    public abstract double dive();
}
