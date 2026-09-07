import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add("B");
        deque.add("C");

        System.out.println("Deque: " + deque);
        System.out.println("Front: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        deque.removeFirst();
        deque.addLast("D");

        System.out.println("After changes: " + deque);
    }
}