import java.util.ArrayDeque;
import java.util.Scanner;

public class StudentQueue {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Serve Student");
            System.out.println("3. View Next Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                queue.addLast(name);
                System.out.println("Student added");

            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Served: " + queue.removeFirst());
                }

            } else if (choice == 3) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Next student: " + queue.peekFirst());
                }

            } else if (choice == 4) {
                System.out.println("Queue: " + queue);

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}