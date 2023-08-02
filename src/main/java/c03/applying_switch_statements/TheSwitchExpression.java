package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 01/08/2023 12:30
 */
public class TheSwitchExpression {
    public static void main(String[] args) {
        int day = 4;
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.println(result);

        int bear = 30;
        result = switch (bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };


        printSeason(4);
    }

    private static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Fall");
        }
    }
}
