package c08.method_references.static_methods;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 09:49
 */
public interface Converter {
    long round(double num);

    public static void main(String[] args) {
        Converter lambda = num -> Math.round(num);
        Converter methodRef = Math::round;

        System.out.println(lambda.round(100.2));
        System.out.println(methodRef.round(100.1));
    }
}
