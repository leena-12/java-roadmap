import java.util.ArrayList;

public class LibraryManagement {

    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book("Clean Code", "Robert Martin"));
        items.add(new Magazine("National Geographic", 245));
        items.add(new Newspaper("Times of India", "10-08-2026"));

        for (LibraryItem item : items) {
            item.displayInfo();
            item.borrow();
            item.returnItem();
            System.out.println();
        }
    }
}