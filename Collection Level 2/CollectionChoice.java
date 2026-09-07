public class CollectionChoice {
    public static void main(String[] args) {
        System.out.println("List:");
        System.out.println("- Use when order matters.");
        System.out.println("- Use when duplicates are allowed.");
        System.out.println("- Good example: students in a class list.");

        System.out.println("\nSet:");
        System.out.println("- Use when duplicates are not allowed.");
        System.out.println("- Good example: unique skills or IDs.");

        System.out.println("\nMap:");
        System.out.println("- Use when you want key-value pairs.");
        System.out.println("- Good example: student ID -> student name.");

        System.out.println("\nWhy HashMap instead of ArrayList?");
        System.out.println("- Use HashMap when you search by key often.");
        System.out.println("- Use ArrayList when you only need ordered items and index-based access.");
    }
}