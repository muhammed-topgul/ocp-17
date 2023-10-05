package c09.queue_and_deque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author muhammed-topgul
 * @since 05/10/2023 15:02
 */
public class DequeMethods {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(2);
        deque.addFirst(1);
        deque.offerFirst(0);

        deque.addLast(3);
        deque.offerLast(4);
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());

        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());

        System.out.println(deque.poll());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());

        System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());

    }
}
