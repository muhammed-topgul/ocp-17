package c02.working_with_binary_arithmetic_operators;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 22:38
 */
public class NumericPromotion {
    public static void main(String[] args) {
        int x1 = 1;
        long y1 = 33;
        var z1 = x1 * y1;
        type(z1);

        double x2 = 39.21;
        float y2 = 2.1F;
        var z2 = x2 + y2;
        type(z2);

        short x3 = 10;
        short y3 = 3;
        var z3 = x3 * y3;
        type(z3);

        short w = 14;
        float x4 = 13;
        double y4 = 30;
        var z4 = w * x4 / y4;
        type(z4);

        byte x5 = 1;
        byte y5 = 5;
        var z5 = (byte) (x5 + y5);
        type(z5);

        int x6 = 1;
        float y6 = 3;
        var z6 = x6 + y6;
        type(z6);
    }

    private static void type(byte param) {
        System.out.println("This is a byte");
    }

    private static void type(short param) {
        System.out.println("This is a short");
    }

    private static void type(int param) {
        System.out.println("This is a int");
    }

    private static void type(long param) {
        System.out.println("This is a long");
    }

    private static void type(float param) {
        System.out.println("This is a float");
    }

    private static void type(double param) {
        System.out.println("This is a double");
    }
}
