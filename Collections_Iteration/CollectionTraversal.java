import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayDeque;

public class CollectionTraversal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println("List using for-each:");
        for (String item : list) {
            System.out.println(item);
        }

        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");

        System.out.println("Set using for-each:");
        for (String item : set) {
            System.out.println(item);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Riya");

        System.out.println("Map using for-each:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");

        System.out.println("Queue using for-each:");
        for (String item : queue) {
            System.out.println(item);
        }
    }
}
