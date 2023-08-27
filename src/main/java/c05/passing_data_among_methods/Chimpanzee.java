package c05.passing_data_among_methods;

/**
 * @author muhammed-topgul
 * @since 28/08/2023 00:55
 */
public class Chimpanzee {
    public void climb(long t) {
    }

    public void swing(Integer u) {
    }

    public void jump(int v) {
    }

    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
        // c.jump(123L); // DOES NOT COMPILE
        c.jump((int) 123L);
    }
}
