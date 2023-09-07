package c07.working_with_enums.switch_statements;

import c07.working_with_enums.creating.Season;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 15:55
 */
public class SwitchStatements {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        var response = switch (summer) {
            case WINTER -> "Get out the sled!";
            case SUMMER -> "Time for the pool!";
            default -> "Is it summer yet?";
        };

        System.out.println(response);
    }
}
