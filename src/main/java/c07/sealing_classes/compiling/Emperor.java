package c07.sealing_classes.compiling;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 16:36
 */
public sealed class Emperor extends Penguin permits A {
}

final class A extends Emperor {

}