package c07.implementing_interface.concrete_methods._private;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:45
 */
public interface ZooRenovation {
    public String projectName();

    abstract String status();

    default void printStatus() {
        System.out.println("The " + projectName() + " project " + status());
    }
}

class Zoo implements ZooRenovation {
    @Override
    public String projectName() {
        return "PRJ-1";
    }

    @Override
    public String status() {
        return "In Progress";
    }

    public static void main(String[] args) {
        new Zoo().printStatus();
    }
}
