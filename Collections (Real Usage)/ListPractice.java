import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Java");
        books.add("Python");
        books.add("Java");

        System.out.println("List: " + books);
        System.out.println("First book: " + books.get(0));
        System.out.println("Contains Python: " + books.contains("Python"));

        books.remove("Java");
        System.out.println("After remove: " + books);

        Collections.sort(books);
        System.out.println("After sort: " + books);

        Collections.reverse(books);
        System.out.println("After reverse: " + books);
    }
}