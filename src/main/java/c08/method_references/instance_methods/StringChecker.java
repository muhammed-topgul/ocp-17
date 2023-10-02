package c08.method_references.instance_methods;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 13:31
 */
public interface StringChecker {
    boolean check();

    public static void main(String[] args) {
        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();
        StringChecker anonymous = new StringChecker() {
            @Override
            public boolean check() {
                return str.isEmpty();
            }
        };

        System.out.println(methodRef.check());
        System.out.println(lambda.check());
        System.out.println(anonymous.check());
    }
}
