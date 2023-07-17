package c01.initializing_variables;

import javax.swing.plaf.PanelUI;

/**
 * @author muhammed-topgul
 * @since 17/07/2023 23:08
 */
public class InferringTheTypeWithVar {
    // var tricky = "Hello"; // DOES NOT COMPILE

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    public void reassignment() {
        var number = 7;
        number = 4;
        // number = "five"; // DOES NOT COMPILE
    }

    public void doesThisCompile(boolean check) {
        // var question; // DOES NOT COMPILE
        // question = 1;
    }

    public void twoTypes() {
        // int a, var b = 3; // DOES NOT COMPILE
        // var n = null;   // DOES NOT COMPILE
    }

//    public int addition(var a, var b) { // DOES NOT COMPILE
//        return a + b;
//    }
}
