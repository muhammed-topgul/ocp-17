package c07.sealing_classes.interfaces;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 17:23
 */
public sealed interface Swims permits Duck, Swan, Floats {
}
