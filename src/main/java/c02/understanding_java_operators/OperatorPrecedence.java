package c02.understanding_java_operators;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 12:48
 */
public class OperatorPrecedence {
    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies; // 9
        System.out.println("Zoo animal receives: " + reward + " reward points");

        var height = 2;
        var length = 3;
        var perimeter = 2 * height + 2 * length;
        System.out.println(perimeter); // 10
    }
}
