class Book extends LibraryItem {

    String author;

    Book(String title, String author) {
        super(title);
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}