package c04.creating_and_manipulating_strings;

/**
 * @author muhammed-topgul
 * @since 10/08/2023 07:37
 */
public class Concatenating {
    public static void main(String[] args) {
        System.out.println(1 + 2);         // 3
        System.out.println("a" + "b");     // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c");   // 3c
        System.out.println("c" + 1 + 2);   // c12
        System.out.println("c" + null);    // cnull

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        var s = "1";            // 1
        s += "2";               // 12
        s += 3;                 // 123
        System.out.println(s);
    }
}
