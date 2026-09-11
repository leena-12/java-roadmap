import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Riya");
        names.add("Amit");
        System.out.println("ArrayList: " + names);

        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Amit");
        uniqueNames.add("Riya");
        uniqueNames.add("Amit");
        System.out.println("HashSet: " + uniqueNames);

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Amit");
        students.put(102, "Riya");
        System.out.println("HashMap: " + students);

        Queue<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
    }
}