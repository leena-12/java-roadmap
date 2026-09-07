import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Student 1");
        queue.add("Student 2");
        queue.add("Student 3");

        System.out.println("Queue: " + queue);
        System.out.println("Next: " + queue.peek());
        System.out.println("Serve: " + queue.poll());
        System.out.println("After serve: " + queue);
        System.out.println("Size: " + queue.size());
    }
}