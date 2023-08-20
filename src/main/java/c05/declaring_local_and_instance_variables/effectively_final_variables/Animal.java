package c05.declaring_local_and_instance_variables.effectively_final_variables;

/**
 * @author muhammed-topgul
 * @since 20/08/2023 20:39
 */
public class Animal {
    public String zooFriends() {
        String name = "Harry the Hippo"; // Effectively final
        var size = 10;
        boolean wet;                     // Effectively final
        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }
}
