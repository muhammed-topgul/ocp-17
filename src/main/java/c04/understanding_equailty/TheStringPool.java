package c04.understanding_equailty;

/**
 * @author muhammed-topgul
 * @since 14/08/2023 13:12
 */
public class TheStringPool {
    public static void main(String[] args) {
        {
            var x = "Hello World";
            var y = "Hello World";
            System.out.println(x == y); // true
        }

        {
            var x = "Hello World";
            var z = " Hello World".trim();
            System.out.println(x == z); // false
        }

        {
            var singleString = "hello world";
            var concat = "hello ";
            concat += "world";
            System.out.println(singleString == concat); // false
        }

        {
            var x = "Hello World";
            var y = new String("Hello World");
            System.out.println(x == y); // false
        }

        {
            // intern()
            var x = "Hello World";
            var y = new String("Hello World");
            System.out.println(x == y.intern()); // false
        }

        {
            var first = "rat" + 1;
            var second = "r" + "a" + "t" + "1";
            var third = "r" + "a" + "t" + new String("1");
            System.out.println(first == second);          // true
            System.out.println(first == second.intern()); // true
            System.out.println(first == third);           // false
            System.out.println(first == third.intern());  // true

        }
    }
}
