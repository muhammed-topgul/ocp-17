package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 01/08/2023 10:54
 */
public class TheSwitchStatement {
    public static void main(String[] args) {
        var animal = 2;
        // After Java 14
        switch (animal) {
            case 1, 2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
                break;
        }

        // Before Java 14
        switch (animal) {
            case 1:
            case 2:
                System.out.println("Lion");
                break;
            case 3:
                System.out.println("Tiger");
        }

        // VALID
        switch (animal) {
        }

        printDayOfWeek(8);
        printSeason(2);
    }

    private static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }
    }

    private static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter");
            case 4, 5, 6:
                System.out.print("Spring");
            default:
                System.out.print("Unknown");
            case 7, 8, 9:
                System.out.print("Summer");
            case 10, 11, 12:
                System.out.print("Fall");
        }
    }
}
