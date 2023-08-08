package c03.writing_while_loops;

/**
 * @author muhammed-topgul
 * @since 08/08/2023 11:02
 */
public class TheWhileStatement {
    public static void main(String[] args) {
        eatCheese(6);

        // Infinitive loop
        while (true)
            System.out.println("Java");
    }

    private static void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println("Bites of cheese left: " + bitesOfCheese);
    }
}
