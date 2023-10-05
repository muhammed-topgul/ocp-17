package c09.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author muhammed-topgul
 * @since 05/10/2023 14:41
 */
public class SetMethods {
    public static void main(String[] args) {
        Set<Character> letters = Set.of('z', 'o');
        Set<Character> characters = Set.copyOf(letters);

        {
            Set<Integer> set = new HashSet<>();
            set.add(66);
            set.add(10);
            set.add(66);
            set.add(8);
            set.forEach(System.out::println);
        }

        {
            Set<Integer> set = new TreeSet<>();
            set.add(66);
            set.add(10);
            set.add(66);
            set.add(8);
            set.forEach(System.out::println);
        }
    }
}
