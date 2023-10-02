package c08.method_references.intro;

/**
 * @author muhammed-topgul
 * @since 02/10/2023 09:45
 */
public class Duckling {
    public static void makeSound(String sound) {
        // LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound, learner);
    }
}
