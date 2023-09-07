package c07.sealing_classes.omitting_the_permits_clause;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 17:17
 */
public sealed class Snake {
    final class Cobra extends Snake {}
}

final class Cobra extends Snake {}
