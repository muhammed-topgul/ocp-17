package c08.method_references.instance_methods_on_parameters;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 14:12
 */
public interface StringParameterCheck {
    boolean check(String text);

    public static void main(String[] args) {
        StringParameterCheck anonymous = new StringParameterCheck() {
            @Override
            public boolean check(String text) {
                return text.isEmpty();
            }
        };
        StringParameterCheck lambda = text -> text.isEmpty();
        StringParameterCheck methodRef = String::isEmpty;

        System.out.println(methodRef.check("Zoo"));
    }
}
