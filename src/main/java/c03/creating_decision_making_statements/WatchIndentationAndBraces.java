package c03.creating_decision_making_statements;

/**
 * @author muhammed-topgul
 * @since 31/07/2023 08:04
 */
public class WatchIndentationAndBraces {
    public static void main(String[] args) {
        int hourOfDay = 12;
        int morningGreetingCount = 0;

        if (hourOfDay < 11)
            System.out.println("Good Morning!");
            morningGreetingCount++;
        System.out.println(morningGreetingCount);  // 1

        if (hourOfDay > 11)
            System.out.println("Good afternoon!");
        else
            System.out.println("Good morning!");
    }
}
