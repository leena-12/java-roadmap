import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;

public class CollectionComparison {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        System.out.println("List: " + list);

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        System.out.println("Set: " + set);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Riya");
        System.out.println("Map: " + map);

        Queue<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue: " + queue);
    }
}