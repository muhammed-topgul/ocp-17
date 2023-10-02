package c08.built_in_functional_interfaces;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 14:27
 */
public class SupplierImpl {
    public static void main(String[] args) {
        {
            Supplier<LocalDate> s1 = LocalDate::now;
            Supplier<LocalDate> s2 = () -> LocalDate.now();
            System.out.println(s1.get());
            System.out.println(s2.get());
        }
        {
            Supplier<StringBuilder> s1 = StringBuilder::new;
            Supplier<StringBuilder> s2 = () -> new StringBuilder();
            System.out.println(s1.get());
            System.out.println(s2.get());
            System.out.println(s1);
        }
    }
}
