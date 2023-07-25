package c02.assigning_values;

/**
 * @author muhammed-topgul
 * @since 25/07/2023 23:24
 */
public class CastingValues {
    public static void main(String[] args) {
        int fur = (int) 5;
        int hair = (short) 5;
        String type = (String) "Bird";
        short tail = 12 + 1;
        // long feathers = 10 (long); // DOES NOT COMPILE

        // float egg = 2.0 / 9;  // DOES NOT COMPILE
        // int tadpole = 5 + 2L; // DOES NOT COMPILE
        // short frog = 3 - 2.0; // DOES NOT COMPILE


        // int fish = 1.0;       // DOES NOT COMPILE
        // short bird = 1921222; // DOES NOT COMPILE
        // int mammal = 9f;      // DOES NOT COMPILE
        // long reptile = 192_301_398_193_810_322; // DOES NOT COMPILE
    }
}
