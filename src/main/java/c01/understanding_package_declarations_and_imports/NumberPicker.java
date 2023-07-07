package c01.understanding_package_declarations_and_imports;

import java.util.*; // imports java.util.Random among other things
import java.util.Random; // import tells us where to find Random

// import all java.lang packages are redundant
import java.lang.System;
import java.lang.*;

/**
 * @author muhammed-topgul
 * @since 07/07/2023 11:51
 */
public class NumberPicker {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10)); // a number 0-9
    }
}
