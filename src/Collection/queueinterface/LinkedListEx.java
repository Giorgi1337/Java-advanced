package Collection.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("George");
        queue.add("Anna");
        queue.add("Zaur");
        queue.add("Bacho");
        System.out.println(queue);
        queue.remove("Zaur");
        System.out.println(queue);

//        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.element());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
    }
}
