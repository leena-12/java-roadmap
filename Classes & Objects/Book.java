public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("Scars", "Taylor Swift", 100);
        b1.display();
    }
}