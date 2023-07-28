package c02.comparing_values;

/**
 * @author muhammed-topgul
 * @since 28/07/2023 07:34
 */
public class EqualityOperators {
    public static void main(String[] args) {
        // boolean monkey = true == 3;       // DOES NOT COMPILE
        // boolean ape = false != "Grape";   // DOES NOT COMPILE
        // boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday);     // false
        System.out.println(tuesday == wednesday); // true

        String user1 = "John";
        String user2 = "John";
        System.out.println(user1 == user2);

        System.out.println(null == null); // true
    }
}

class File {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }
}
