package c05.declaring_local_and_instance_variables;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 20:25
 */
public class Lion {
    int hunger = 4; // Instance variable

    public int feedZooAnimals() {
        int snack = 10;                // Local variable
        if (snack > 4) {
            long dinnerTime = snack++; // Local variable
            hunger--;
        }
        return snack;
    }
}
