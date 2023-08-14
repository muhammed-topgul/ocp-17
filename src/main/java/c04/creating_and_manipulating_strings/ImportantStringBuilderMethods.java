package c04.creating_and_manipulating_strings;

/**
 * @author muhammed-topgul
 * @since 14/08/2023 10:30
 */
public class ImportantStringBuilderMethods {
    public static void main(String[] args) {
        {
            var sb = new StringBuilder("animals");
            String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
            int length = sb.length();
            char ch = sb.charAt(6);
            System.out.println(sub + " " + length + " " + ch);
        }

        {
            // append()
            StringBuilder sb = new StringBuilder().append(1).append('c');
            sb.append("-").append(true);
            System.out.println(sb);
        }

        {
            // insert()
            var sb = new StringBuilder("animals");
            sb.insert(7, "-"); // animals
            sb.insert(0, "-"); // -animals
            sb.insert(4, "-"); // -ani-mals
            System.out.println(sb);
        }

        {
            // delete() and deleteCharAt()
            var sb = new StringBuilder("abcdef");
            System.out.println(sb.delete(1, 3));      // adef
            System.out.println(sb.deleteCharAt(1));   // aef
            // System.out.println(sb.deleteCharAt(100)); // Exception
            System.out.println(sb.delete(2, 100));    // ae
        }

        {
            // replace()
            var builder = new StringBuilder("pigeon dirty");
            System.out.println(builder.replace(3, 6, "sty")); // pigsty dirty
            builder = new StringBuilder("pigeon dirty");
            System.out.println(builder.replace(3, 100, ""));  // pig
        }

        {
            // reverse()
            StringBuilder sb = new StringBuilder("ABC");
            System.out.println(sb.reverse()); // CBA
        }
    }
}
