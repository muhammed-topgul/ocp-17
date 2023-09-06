package c07.implementing_interface.concrete_methods._static;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:35
 */
public interface Hop {
    static int getJumpHeight() {
        return 8;
    }

    public static void info() {
        System.out.println("I am the info()");
    }

    private static void message() {
        System.out.println("I am the message()");
    }
}
