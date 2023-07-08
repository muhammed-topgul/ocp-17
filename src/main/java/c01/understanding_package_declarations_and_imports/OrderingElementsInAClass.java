package c01.understanding_package_declarations_and_imports; // package must be first non-comment

import java.util.*; // imports must be after package

/**
 * @author muhammed-topgul
 * @since 08/07/2023 16:42
 */
public class OrderingElementsInAClass { // then comes the class
    double weight; // fields and methods can go in either order

    public double getWeight() {
        return weight;
    }

    double height; // another field - they do not need to be together
}
