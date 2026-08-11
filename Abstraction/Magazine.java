class Magazine extends LibraryItem {

    int issueNumber;

    Magazine(String title, int issueNumber) {
        super(title);
        this.issueNumber = issueNumber;
    }

    void displayInfo() {
        System.out.println("Magazine: " + title + " Issue #" + issueNumber);
    }
}