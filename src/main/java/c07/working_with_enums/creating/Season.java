package c07.working_with_enums.creating;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 14:10
 */
public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    public static void main(String[] args) {
        var season = Season.SUMMER;
        System.out.println(season);
        System.out.println(Season.SUMMER);
        System.out.println(Season.SUMMER == season);

        for (var s : Season.values()) {
            System.out.println(s.name() + ": " + s.ordinal());
        }

        System.out.println(Season.valueOf("SUMMER"));
        System.out.println(Season.valueOf("summer")); // java.lang.IllegalArgumentException
    }
}

// enum ExtendedSeason extends Season {} // DOES NOT COMPILE
