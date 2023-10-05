package c09.queue_and_deque;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author muhammed-topgul
 * @since 05/10/2023 14:52
 */
public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Add to end
        queue.add(1);  // throws exception when null
        queue.add(2);
        queue.offer(3);
        queue.offer(4);

        // Read from front
        System.out.println(queue.element()); // 1 // throws exception when null
        System.out.println(queue.peek());    // 1

        System.out.println(queue.remove());  // 1 // throws exception when null
        System.out.println(queue.poll());    // 2

        System.out.println(queue);           // [3, 4]
    }
}
