package c07.records.declaring_constructor;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 20:06
 */
public final record Crane(int numberEggs, String name) {
    public Crane() {
        this(0, "No info");
    }

    public Crane(int numberEggs, String name) {
        if (numberEggs < 0)
            throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name.toUpperCase();
    }
}

record CraneCompact(int numberEggs, String name) {
    public CraneCompact {
        if (numberEggs < 0)
            throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}

class CraneMain {
    public static void main(String[] args) {
        Crane crane = new Crane();
        System.out.println(crane);
        System.out.println(new CraneCompact(45, "Jaime"));
    }
}


