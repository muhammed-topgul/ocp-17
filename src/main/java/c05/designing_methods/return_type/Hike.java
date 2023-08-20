package c05.designing_methods.return_type;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 19:01
 */
public class Hike {
    public void hike1() {
    }

    public void hike2() {
    }

    public String hike3() {
        return "";
    }

    // public String hike4() {}    // DOES NOT COMPILE
    // public hike5() {}           // DOES NOT COMPILE
    // public String int hike() {} // DOES NOT COMPILE

    // DOES NOT COMPILE
    // String hike7(int a) {
    //    if (1 < 2)
    //        return "orange";
    // }

    String hike8(int a) {
        if (1 < 2)
            return "orange";
        return "apple";
    }
}
