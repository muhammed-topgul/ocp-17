package c05.method_signature;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 19:26
 */
public class Trip {
    public void visitZoo(String name, int waitTime) {}
    // public void visitZoo(String attraction, int rainFall) {} // DOES NOT COMPILE
    public void visitZoo(int rainFall, String attraction) {}
}
