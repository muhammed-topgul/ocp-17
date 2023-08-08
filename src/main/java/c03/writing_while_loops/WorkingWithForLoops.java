package c03.writing_while_loops;

/**
 * @author muhammed-topgul
 * @since 08/08/2023 15:49
 */
public class WorkingWithForLoops {
    public static void main(String[] args) {
//        for (; ; ) {
//            System.out.println("Infinite loop!");
//        }

        {
            int x = 0;
            for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
                System.out.print(y + " ");
            }
            System.out.println(x + " ");
        }

    }
}
