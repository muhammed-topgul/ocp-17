package c09.list;

import java.util.ArrayList;

/**
 * @author muhammed-topgul
 * @since 04/10/2023 16:10
 */
public class ListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add(1, "Hibernate");
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
        list.replaceAll((a) -> a.toUpperCase());
        list.set(1, "Tomcat");
        list.sort((a, b) -> b.compareToIgnoreCase(a));
        System.out.println(list);
    }
}
