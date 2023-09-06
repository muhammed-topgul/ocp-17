package c07.implementing_interface.inheritance;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 16:52
 */
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
