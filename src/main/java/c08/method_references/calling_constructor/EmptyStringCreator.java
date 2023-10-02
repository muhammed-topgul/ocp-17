package c08.method_references.calling_constructor;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 14:17
 */
public interface EmptyStringCreator {
    String create();

    public static void main(String[] args) {
        EmptyStringCreator anonymous = new EmptyStringCreator() {
            @Override
            public String create() {
                return new String();
            }
        };
        EmptyStringCreator lambda = () -> new String();
        EmptyStringCreator methodRef = String::new;
    }
}


interface StringCopier {
    String copy(String value);

    public static void main(String[] args) {
        StringCopier anonymous = new StringCopier() {
            @Override
            public String copy(String value) {
                return new String(value);
            }
        };

        StringCopier lambda = (value) -> new String(value);
        StringCopier methodRef = String::new;
    }
}