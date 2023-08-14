package c04.understanding_equailty;

/**
 * @author muhammed-topgul
 * @since 14/08/2023 11:04
 */
public class UnderstandingEquality {
    public static void main(String[] args) {
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);   // false
        System.out.println(one == three); // true
    }
}
