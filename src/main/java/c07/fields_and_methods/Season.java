package c07.fields_and_methods;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 16:00
 */
public enum Season {
//    WINTER("Low"),
//    SPRING("Medium"),
//    SUMMER("High"),
    FALL("Medium");

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        System.out.println(expectedVisitors + " constructing.");
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
