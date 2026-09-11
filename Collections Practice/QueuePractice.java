import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("Student 1");
        queue.add("Student 2");
        queue.add("Student 3");

        System.out.println("Queue: " + queue);
        System.out.println("First student: " + queue.peek());
        System.out.println("Removed student: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("ArrayDeque: " + deque);
    }
}