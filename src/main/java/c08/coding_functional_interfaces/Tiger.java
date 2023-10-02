package c08.coding_functional_interfaces;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 09:32
 */
public class Tiger implements Sprint {
    @Override
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}
