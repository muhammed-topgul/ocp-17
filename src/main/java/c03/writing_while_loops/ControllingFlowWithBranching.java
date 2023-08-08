package c03.writing_while_loops;

/**
 * @author muhammed-topgul
 * @since 08/08/2023 16:09
 */
public class ControllingFlowWithBranching {
    public static void main(String[] args) {
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                if (mySimpleArray[i] == 8) {
                    System.out.println();
                    continue OUTER_LOOP;
                }
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                if (mySimpleArray[i] == 8) {
                    break INNER_LOOP;
                }
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}
