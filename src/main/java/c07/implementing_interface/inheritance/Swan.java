package c07.implementing_interface.inheritance;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:43
 */
public class Swan extends Bird implements Swim {
    @Override
    int getType() {
        return 0;
    }

    @Override
    boolean canSwoop() {
        return false;
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
