package c07.implementing_interface.concrete_methods._default;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:29
 */
public class Cat implements Walk, Run {
    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
        // return 10;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}
