package c07.nested_classes.inner_class;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 20:44
 */
public class Home {
    private String greeting = "Hi"; // Outer class instance variable

    public void enterRoom() {
        Room room = new Room();
        room.enter();
        Room.greet(greeting);
    }

    protected class Room {
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }

        private static void greet(String message) {
            System.out.println(message);
        }
    }
}

class HomeMain extends Home {
    public void print() {
        System.out.println(new Room().repeat);
    }

    public static void main(String[] args) {
        HomeMain homeMain = new HomeMain();
        homeMain.enterRoom();
        homeMain.print();

        System.out.println();
        Home home = new Home();
        Room room = home.new Room();
        room.enter();
        System.out.println(home.getClass().getName());
        System.out.println(room.getClass().getName());
    }
}
