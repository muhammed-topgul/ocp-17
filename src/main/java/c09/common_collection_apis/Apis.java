package c09.common_collection_apis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author muhammed-topgul
 * @since 04/10/2023 09:55
 */
public class Apis {
    public static void main(String[] args) {
        {
            // Adding Data
            System.out.println("\n# Adding Data");
            Collection<String> list = new ArrayList<>();
            System.out.println(list.add("Sparrow")); // true
            System.out.println(list.add("Sparrow")); // true

            Collection<String> set = new HashSet<>();
            System.out.println(set.add("Sparrow")); // true
            System.out.println(set.add("Sparrow")); // false
        }

        {
            // Removing Data
            System.out.println("\n# Removing Data");
            Collection<String> birds = new ArrayList<>();
            birds.add("hawk");  // [hawk]
            birds.add("hawk");  // [hawk, hawk]
            System.out.println(birds.remove("cardinal")); // false
            System.out.println(birds.remove("hawk")); // true
            System.out.println(birds); // [hawk]
        }

        {
            // Counting Elements
            System.out.println("\n# Counting Elements");
            Collection<String> birds = new ArrayList<>();
            System.out.println(birds.isEmpty()); // true
            System.out.println(birds.size()); // 0
            birds.add("hawk");  // [hawk]
            birds.add("hawk");  // [hawk, hawk]
            System.out.println(birds.isEmpty()); // false
            System.out.println(birds.size()); // 2
        }

        {
            // Clearing The Collection
            System.out.println("\n# Clearing The Collection");
            Collection<String> birds = new ArrayList<>();
            birds.add("hawk");  // [hawk]
            birds.add("hawk");  // [hawk, hawk]
            System.out.println(birds.isEmpty()); // false
            System.out.println(birds.size()); // 2
            birds.clear();
            System.out.println(birds.isEmpty()); // true
            System.out.println(birds.size()); // 0
        }

        {
            // Check Contents
            System.out.println("\n# Check Contents");
            Collection<String> birds = new ArrayList<>();
            birds.add("hawk"); // [hawk]
            System.out.println(birds.contains("hawk")); // true
            System.out.println(birds.contains("robin")); // false
        }

        {
            // Removing with Conditions
            System.out.println("\n# Removing with Conditions");
            Collection<String> list = new ArrayList<>();
            list.add("Magician");
            list.add("Assistant");
            System.out.println(list); // [Magician, Assistant]
            list.removeIf(element -> element.startsWith("A"));
            System.out.println(list); // [Assistant]

            Collection<String> set = new HashSet<>();
            set.add("Wand");
            set.add("");
            set.removeIf(String::isEmpty);
            System.out.println(set); // [Wand]
        }

        {
            // Iterating
            System.out.println("\n# Iterating");
            Collection<String> cats = List.of("Annie", "Ripley");
            cats.forEach(System.out::println);
        }

        {
            // Determining Equality
            System.out.println("\n# Determining Equality");
            var list1 = List.of(1, 2);
            var list2 = List.of(2, 1);
            var set1 = Set.of(1, 2);
            var set2 = Set.of(2, 1);
            System.out.println(list1.equals(list2)); // false
            System.out.println(set1.equals(set2));   // true
            System.out.println(list1.equals(set1));  // false
        }
    }
}
