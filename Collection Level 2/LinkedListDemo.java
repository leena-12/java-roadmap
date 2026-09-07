import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Amit");
        names.add("Leena");
        names.add("Rahul");

        System.out.println("Names: " + names);
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());

        names.removeFirst();
        System.out.println("After removing first: " + names);

        names.addFirst("Priya");
        System.out.println("After adding first: " + names);
    }
}