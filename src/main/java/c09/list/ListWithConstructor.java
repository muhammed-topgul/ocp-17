package c09.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author muhammed-topgul
 * @since 04/10/2023 16:03
 */
public class ListWithConstructor {
    public static void main(String[] args) {
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<>(linked1);

        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<>(list1);
        var list3 = new ArrayList<String>(10);

        var list4 = new ArrayList<>();
        list4.add("a");
    }
}
