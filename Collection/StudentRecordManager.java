import java.util.HashMap;
import java.util.Scanner;

public class StudentRecordManager {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.put(id, name);
                System.out.println("Student added");

            } else if (choice == 2) {
                System.out.println("Students: " + students);

            } else if (choice == 3) {
                System.out.print("Enter Student ID to search: ");
                int id = sc.nextInt();

                if (students.containsKey(id)) {
                    System.out.println("Student Name: " + students.get(id));
                } else {
                    System.out.println("Student not found");
                }

            } else if (choice == 4) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();

                if (students.containsKey(id)) {
                    students.remove(id);
                    System.out.println("Student deleted");
                } else {
                    System.out.println("Student not found");
                }

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
