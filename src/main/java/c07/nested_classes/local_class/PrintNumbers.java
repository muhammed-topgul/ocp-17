package c07.nested_classes.local_class;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 10:47
 */
public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        int width = 20;
        class Calculator {
            public void multiply() {
                System.out.println(length * width);
            }
        }
        Calculator calculator = new Calculator();
        calculator.multiply();
    }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;

        class VolumeCalculator {
            public int multiply() {
                return length * width * height;
            }
        }
        // width = 2; // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.calculate();
    }
}
