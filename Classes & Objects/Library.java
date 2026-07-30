import java.util.Scanner;

public class Library {

    static class Book {
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
    }

    Book[] books = new Book[100];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    void addBook() {
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());

        books[count] = new Book(title, author, price);
        count++;

        System.out.println("Book added.");
    }

    void displayBooks() {
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }

        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }

    void searchBook() {
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }

        System.out.print("Enter title or author to search: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(keyword) ||
                books[i].author.toLowerCase().contains(keyword)) {
                books[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    void menu() {
        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                displayBooks();
            } else if (choice == 3) {
                searchBook();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.menu();
    }
}