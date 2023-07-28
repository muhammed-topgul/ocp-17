package c02.comparing_values;

/**
 * @author muhammed-topgul
 * @since 28/07/2023 08:51
 */
public class RelationalOperators {
    public static void main(String[] args) {
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;
        openZoo(zooTime);
        openZoo(num);
        openZoo(obj);
        openZoo(new Object());
        openZoo((short) 1);

        String noObjectHere = null;
        System.out.println(noObjectHere instanceof String); // false
        System.out.println(null instanceof Object);         // false
        // System.out.println(null instanceof null);        // DOES NOT COMPILE
    }

    private static void openZoo(Object time) {
        if (time instanceof Integer zooTime) {
            System.out.println("It is an Integer");
        } else if (time instanceof Number) {
            System.out.println("It is a Number");
        } else {
            System.out.println("It is an Object");
        }
    }

    private static void openZoo(Number time) {
        // if (time instanceof String) { // DOES NOT COMPILE
        //    System.out.println(time);
        // }
    }
}
