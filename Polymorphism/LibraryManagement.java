import java.util.ArrayList;

class LibraryItem {
    protected String title;

    LibraryItem(String title) {
        this.title = title;
    }

    void displayDetails() {
        System.out.println("Library item: " + title);
    }
}

class Book extends LibraryItem {
    private String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    void displayDetails() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    @Override
    void displayDetails() {
        System.out.println(
            "Magazine: " + title + " | Issue: " + issueNumber
        );
    }
}

class Newspaper extends LibraryItem {
    private String date;

    Newspaper(String title, String date) {
        super(title);
        this.date = date;
    }

    @Override
    void displayDetails() {
        System.out.println(
            "Newspaper: " + title + " | Date: " + date
        );
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book("Clean Code", "Robert Martin"));
        items.add(new Magazine("Tech World", 25));
        items.add(new Newspaper("The Daily News", "09-Aug-2026"));

        System.out.println("Library Items:");

        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}