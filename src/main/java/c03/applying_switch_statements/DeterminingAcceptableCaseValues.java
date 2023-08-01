package c03.applying_switch_statements;

/**
 * @author muhammed-topgul
 * @since 01/08/2023 11:12
 */
public class DeterminingAcceptableCaseValues {
    public static void main(String[] args) {

    }

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
            // case apples:       // DOES NOT COMPILE
            // case getCookies(): // DOES NOT COMPILE
            // case cookies:      // DOES NOT COMPILE
            case 3 * 5:
        }
    }
}
