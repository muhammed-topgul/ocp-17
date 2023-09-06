package c07.implementing_interface.implicit_modifiers;

/**
 * @author muhammed-topgul
 * @since 06/09/2023 17:10
 */
public class AbstractVsInterface {
}


abstract class Husky {
    abstract void play();
}

interface Poodle {
    void play();
}

class Webby extends Husky {
    @Override
    void play() {} // OK
}

class Georgette implements Poodle {
    @Override
    public void play() {} // DOES NOT COMPILE without public
}