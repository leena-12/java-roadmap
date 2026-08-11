abstract class LibraryItem {

    String title;
    boolean isBorrowed;

    LibraryItem(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    abstract void displayInfo();

    void borrow() {
        isBorrowed = true;
        System.out.println(title + " borrowed");
    }

    void returnItem() {
        isBorrowed = false;
        System.out.println(title + " returned");
    }
}
