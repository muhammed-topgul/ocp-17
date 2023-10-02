package c08.simple_lambda;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 08:57
 */
public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
