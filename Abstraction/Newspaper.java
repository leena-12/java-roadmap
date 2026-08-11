class Newspaper extends LibraryItem {

    String date;

    Newspaper(String title, String date) {
        super(title);
        this.date = date;
    }

    void displayInfo() {
        System.out.println("Newspaper: " + title + " dated " + date);
    }
}