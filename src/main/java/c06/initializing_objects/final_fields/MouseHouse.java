package c06.initializing_objects.final_fields;

/**
 * @author muhammed-topgul
 * @since 31/08/2023 15:01
 */
public class MouseHouse {
    private final int volume;
    private final String name;

    {
        volume = 10;
    }

    public MouseHouse() {
        this.name = "Empty House";
    }
}
