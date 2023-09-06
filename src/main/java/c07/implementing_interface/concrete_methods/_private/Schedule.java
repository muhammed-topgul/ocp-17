package c07.implementing_interface.concrete_methods._private;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:40
 */
public interface Schedule {
    default void wakeUp() {
        checkTime(7);
    }

    private void haveBreakfast() {
        checkTime(9);
    }

    static void workOut() {
        checkTime(18);
    }

    private static void checkTime(int hour) {
        if (hour > 17) {
            System.out.println("You're late...");
        } else {
            System.out.println("You have " + (17 - hour) + " hours left to make the appointment");
        }
    }
}
