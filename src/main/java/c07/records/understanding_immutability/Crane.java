package c07.records.understanding_immutability;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 20:00
 */
public final record Crane(int numberEggs, String name) implements Person {
    @Override
    public void printInfo() {
        System.out.println("Eggs: " + numberEggs + ", Name: " + name);
    }
}

sealed interface Person permits Crane {
    void printInfo();
}

class CraneMain {
    public static void main(String[] args) {
        var cousin = new Crane(3, "Jenny");
        var friend = new Crane(cousin.numberEggs(), "Janeice");

        cousin.printInfo();
        System.out.println(cousin);
    }
}
