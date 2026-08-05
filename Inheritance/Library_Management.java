class LibraryItem {
    private String title;
    private String itemId;
    private boolean isAvailable;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void display() {
        System.out.println("Title    : " + title);
        System.out.println("Item ID  : " + itemId);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String itemId, String author, int pages) {
        super(title, itemId);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        }
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author   : " + author);
        System.out.println("Pages    : " + pages);
        System.out.println("--------------------");
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0) {
            this.issueNumber = issueNumber;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Issue No : " + issueNumber);
        System.out.println("--------------------");
    }
}

class Newspaper extends LibraryItem {
    private String date;

    public Newspaper(String title, String itemId, String date) {
        super(title, itemId);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date != null && !date.trim().isEmpty()) {
            this.date = date;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Date     : " + date);
        System.out.println("--------------------");
    }
}

public class Library_Management {
    public static void main(String[] args) {
        Book book = new Book("Scars", "B001", "Taylor Swift", 250);
        Magazine magazine = new Magazine("Tech Today", "M001", 42);
        Newspaper newspaper = new Newspaper("Daily News", "N001", "2026-08-05");

        System.out.println("=== Book ===");
        book.display();
        book.borrow();
        book.borrow(); // already borrowed
        book.returnItem();

        System.out.println("\n=== Magazine ===");
        magazine.display();

        System.out.println("\n=== Newspaper ===");
        newspaper.display();
    }
}