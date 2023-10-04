package c09.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muhammed-topgul
 * @since 04/10/2023 16:20
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2
    }
}
