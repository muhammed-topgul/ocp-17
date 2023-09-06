package c07.implementing_interface.concrete_methods._static;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:38
 */
public class Bunny implements Hop {
    public void printDetails() {
        // System.out.println(getJumpHeight()); DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight());
    }
}
