package c04.creating_and_manipulating_strings;

/**
 * @author muhammed-topgul
 * @since 10/08/2023 07:43
 */
public class ImportantStringMethods {
    public static void main(String[] args) {
        var animals = "animals";
        // length()
        System.out.println(animals.length());  // 7

        // charAt()
        System.out.println(animals.charAt(0)); // a
        System.out.println(animals.charAt(6)); // s
        // System.out.println(animals.charAt(7)); // exception

        // indexOf()
        System.out.println(animals.indexOf("a")); // 0
        System.out.println(animals.indexOf("a", 2)); // 4
        System.out.println(animals.indexOf('a', 2)); // 4
        System.out.println(animals.indexOf("ima", 2)); // 4
        System.out.println(animals.indexOf("x")); // -1

        // substring()
        System.out.println(animals.substring(2)); // imals
        System.out.println(animals.substring(2, 4)); // im
        System.out.println(animals.substring(animals.indexOf('i'))); // imals
        System.out.println(animals.substring(2, 2)); // empty string
        // System.out.println(animals.substring(animals.indexOf('i'), 1)); // exception
        // System.out.println(animals.substring(3, 2)); // exception
        // System.out.println(animals.substring(3, 8)); // exception

        // toUpperCase()
        System.out.println(animals.toUpperCase());

        // equals() and equalsIgnoreCase()
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startWith(), endWith() and contains()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c"));   // true
        System.out.println("abc".endsWith("a"));   // false
        System.out.println("abc".contains("b"));   // true
        System.out.println("abc".contains("B"));   // false

        // replace()
        System.out.println("abcabc".replace("ab", "AB"));
        System.out.println("abcabc".replace('a', 'A'));

        // strip() and trim()
        System.out.println("abc".strip());        // abc
        System.out.println("\t a b c\n".strip()); // a b c
        var text = " abc\t";
        System.out.println(text);                          //  abc
        System.out.println(text.length());                 // 5
        System.out.println(text.trim().length());          // 3
        System.out.println(text.strip().length());         // 3
        System.out.println(text.stripLeading().length());  // 4
        System.out.println(text.stripTrailing().length()); // 4

        // indent() and stripIndent()
        var block = """                 
                a
                 b         
                c""";

        var concat = " a\n"
                + "  b\n"
                + " c";

        System.out.println(block.length());  // 6
        System.out.println(concat.length()); // 9
        System.out.println(block);
        System.out.println(block.indent(1));
        System.out.println(block.indent(1).length());
        System.out.println(concat);
        System.out.println(concat.indent(-1));
        System.out.println(concat.indent(-1).length());
        System.out.println(concat);
        System.out.println(concat.indent(-4));
        System.out.println(concat.indent(-4).length());    // 6
        System.out.println(concat.stripIndent().length()); // 6

        // translatingEscapes()
        var str = "1\\t2";
        System.out.println(str);                    // 1\t2
        System.out.println(str.translateEscapes()); // 1	2

        // isBlank() and isEmpty()
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty());  // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank());  // true

        // format()
        var name = "Kate";
        var orderId = 5;

        // All print: Hello Kate, order 5 ready
        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n   Score: %f out of %d".formatted(name, score, total));

        // System.out.println("Food: %d tons".formatted(2.0)); // IllegalFormatConversionException
        var pi = 3.14159265359;
        System.out.format("[%f]\n", pi);      // [3.141593]
        System.out.format("[%12.8f]\n", pi);  // [  3.14159265]
        System.out.format("[%012.8f]\n", pi); // [003.14159265]
        System.out.format("[%012f]\n", pi);   // [00003.141593]
        System.out.format("[%12.2f]\n", pi);  // [        3.14]
        System.out.format("[%.2f]\n", pi);    // [3.14]

        // Method Chaining
        var result = "AniMal ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result); // AnimAl
    }
}
