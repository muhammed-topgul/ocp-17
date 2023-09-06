package c07.implementing_interface.extending;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:33
 */
public class Owl implements HasBigEyes {
    @Override
    public void flap() {
        System.out.println("Owl flap");
    }

    @Override
    public void watch() {
        System.out.println("Owl watch");
    }

    @Override
    public int hunt() {
        System.out.println("Owl hunt");
        return 0;
    }
}
