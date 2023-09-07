package c07.records.applying;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 19:50
 */
public record Crane(int numberEggs, String name) {
}

class CraneMain {
    public static void main(String[] args) {
        Crane cammy = new Crane(4, "Cammy");
        System.out.println(cammy.numberEggs());
        System.out.println(cammy.name());

        // new Crane("Cammy", 4); // DO NOT COMPILE
        // new Crane("Cammy");    // DO NOT COMPILE

        Crane cammy1 = new Crane(4, "Cammy");
        System.out.println(cammy1.equals(cammy));
        System.out.println(cammy.hashCode() + " " + cammy1.hashCode());
        System.out.println(cammy);
    }
}