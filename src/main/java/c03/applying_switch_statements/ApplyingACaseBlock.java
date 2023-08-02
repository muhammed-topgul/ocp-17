package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 02/08/2023 12:32
 */
public class ApplyingACaseBlock {
    public static void main(String[] args) {
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10)
                    yield "Blobfish";
                else  // DOES NOT COMPILE without else
                    yield "Green";
            }
            // case 4 -> {} // DOES NOT COMPILE without yield
            // case 5 -> {yield "Trout";}; // DOES NOT COMPILE (extra semicolon at the end)
            default -> "Swordfish";
        }; // DOES NOT COMPILE without semicolon
    }
}
