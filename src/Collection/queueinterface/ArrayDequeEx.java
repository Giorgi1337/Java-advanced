package Collection.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(2);
        deque.addFirst(5);
        deque.addLast(22);
        deque.offerFirst(14);
        deque.offerLast(24);

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);
    }
}
