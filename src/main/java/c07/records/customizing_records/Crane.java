package c07.records.customizing_records;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 20:32
 */
public final record Crane(int numberEggs, String name) {
    private static int type1 = 10;
    public static final int type2 = 20;

    // public int size = 1; // DOES NOT COMPILE

    @Override
    public int numberEggs() {
        return numberEggs * 2;
    }

    @Override
    public String name() {
        return name.toUpperCase();
    }

    public String getName() {
        return name();
    }
}
