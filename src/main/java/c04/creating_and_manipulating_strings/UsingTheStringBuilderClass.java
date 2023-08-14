package c04.creating_and_manipulating_strings;

/**
 * @author muhammed-topgul
 * @since 14/08/2023 10:24
 */
public class UsingTheStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end");
        System.out.println(sb == same);  // true

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);
    }
}
