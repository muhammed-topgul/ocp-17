package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 02/08/2023 12:38
 */
public class CoveringAllPossibleValues {
    public static void main(String[] args) {
        System.out.println(getWeather(1));
        System.out.println(getWeather(Season.SPRING));
    }

    private static String getWeather(int season) {
        return switch (season) {
            case 0 -> "Cold";
            case 1 -> "Rainy";
            case 2 -> "Hot";
            case 3 -> "Warm";
            default -> "Invalid data";
        };
    }

    // If the switch expression takes an enum value, add a case branch for every possible enum value.
    private static String getWeather(Season season) {
        return switch (season) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}

enum Season {
    WINTER, SPRING, SUMMER, FALL;
}
