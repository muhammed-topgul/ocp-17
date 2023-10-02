package c08.method_references.instance_methods;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 13:24
 */
public interface StringStart {
    boolean beginningCheck(String s);

    public static void main(String[] args) {
        var str = "Zoo";
        StringStart lambda = s -> str.startsWith(s);
        StringStart methodRef = str::startsWith;
        System.out.println(methodRef.beginningCheck("Z"));
        System.out.println(lambda.beginningCheck("A"));
    }
}
