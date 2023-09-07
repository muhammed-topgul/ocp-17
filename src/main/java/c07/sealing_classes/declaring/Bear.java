package c07.sealing_classes.declaring;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 16:25
 */
public sealed class Bear permits Kodiak, Panda {
}

non-sealed class Kodiak extends Bear {
}

final class Panda extends Bear {
}

class KodiakChild extends Kodiak {
}

// class PandaChild extends Panda {}