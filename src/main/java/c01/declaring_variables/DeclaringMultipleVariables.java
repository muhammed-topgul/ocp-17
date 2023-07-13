package c01.declaring_variables;

/**
 * @author muhammed-topgul
 * @since 13/07/2023 23:17
 */
public class DeclaringMultipleVariables {
    // int num, String value; // DOES NOT COMPILE

    void sandFence() {
        String s1, s2;
        String s3 = "Yes", s4 = "No";
    }

    void paintFence() {
        int i1, i2, i3 = 1;
    }
}
