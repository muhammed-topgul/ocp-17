package c05.accessing_static_data.static_variable_or_method;

/**
 * @author muhammed-topgul
 * @since 27/08/2023 23:50
 */
public class Snake {
    public static long hiss = 2;

    public static void main(String[] args) {
        System.out.println(Snake.hiss);

        Snake snake = new Snake();
        System.out.println(snake.hiss);
        snake = null;
        System.out.println(snake.hiss);
    }
}
