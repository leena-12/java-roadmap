import java.util.ArrayDeque;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("Amit");
        queue.add("Riya");
        queue.add("Sahil");

        System.out.println("Queue: " + queue);
        System.out.println("First student: " + queue.peek());

        System.out.println("Served student: " + queue.remove());
        System.out.println("Queue after serving: " + queue);
    }
}