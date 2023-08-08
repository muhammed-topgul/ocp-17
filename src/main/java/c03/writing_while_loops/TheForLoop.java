package c03.writing_while_loops;

/**
 * @author muhammed-topgul
 * @since 08/08/2023 13:14
 */
public class TheForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value: " + i);
        }

        int i = 0;
        for (; i < 10; i++) {
            System.out.println("Value: " + i);
        }

        for (var j = 5; j > 0; j--) {
            System.out.println("J: " + i);
        }
    }
}
