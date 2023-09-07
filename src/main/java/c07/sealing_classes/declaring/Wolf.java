package c07.sealing_classes.declaring;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 16:32
 */
public abstract sealed class Wolf permits Timber {
}

final class Timber extends Wolf {
}

// final class MyWolf extends Wolf {} // DOES NOT COMMIT
