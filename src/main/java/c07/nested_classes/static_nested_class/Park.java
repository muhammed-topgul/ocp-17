package c07.nested_classes.static_nested_class;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 10:41
 */
public class Park {
    private String name;
    private static int year;

    public static class Ride {
        private int price;

        public void info() {
            System.out.println(year + " "  + price);
        }

        public int getPrice() {
            return price;
        }
    }
}

class ParkMain {
    public static void main(String[] args) {
        Park.Ride ride = new Park.Ride();
        System.out.println(ride.getPrice());
        ride.info();
    }
}
