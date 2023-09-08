package c07.polymorphism.casting_objects;

import c07.polymorphism.object_vs_reference.Lemur;
import c07.polymorphism.object_vs_reference.Primate;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 12:17
 */
public class Cast {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Primate primate = lemur;

        Lemur lemur1 = (Lemur) primate;

        // Lemur lemur2 = primate; // DOES NOT COMPILE (missing cast)
    }
}
