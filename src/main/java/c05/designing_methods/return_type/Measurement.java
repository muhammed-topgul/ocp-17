package c05.designing_methods.return_type;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 19:08
 */
public class Measurement {
    int getHeight1() {
        int temp = 9;
        return temp;
    }
    /*
    int getHeight2() {
        int temp = 9L; // DOES NOT COMPILE
        return temp;
    }
    int getHeight3() {
        long temp = 9L;
        return temp; // DOES NOT COMPILE
    }
    */
}
