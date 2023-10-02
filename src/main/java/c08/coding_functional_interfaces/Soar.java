package c08.coding_functional_interfaces;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 09:36
 */
@FunctionalInterface
public interface Soar {
    abstract String toString();

    public boolean equals(Object o);

    // public void equals(Soar soar);

    public abstract int hashCode();

    public void dive();
}
