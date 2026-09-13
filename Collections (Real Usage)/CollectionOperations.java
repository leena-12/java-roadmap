import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionOperations {
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }

    static ArrayDeque<Student> waitingList = new ArrayDeque<>();
    static HashSet<Integer> uniqueIds = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);
        waitingList.add(student);
        uniqueIds.add(id);

        System.out.println("Student added to waiting list.");
    }

    static void serveStudent() {
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            Student student = waitingList.remove();
            System.out.println("Served student: " + student);
        }
    }

    static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;

        for (Student student : waitingList) {
            if (student.id == id) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found in waiting list.");
        }
    }

    static void displayWaitingList() {
        if (waitingList.isEmpty()) {
            System.out.println("Waiting list is empty.");
        } else {
            System.out.println("Waiting List:");
            for (Student student : waitingList) {
                System.out.println(student);
            }
        }
    }

    static void displayUniqueIds() {
        if (uniqueIds.isEmpty()) {
            System.out.println("No student IDs found.");
        } else {
            System.out.println("Unique Student IDs: " + uniqueIds);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Library Waiting List =====");
            System.out.println("1. Add Student to Waiting List");
            System.out.println("2. Serve Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Waiting List");
            System.out.println("5. Display Unique Student IDs");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent();
            } else if (choice.equals("2")) {
                serveStudent();
            } else if (choice.equals("3")) {
                searchStudent();
            } else if (choice.equals("4")) {
                displayWaitingList();
            } else if (choice.equals("5")) {
                displayUniqueIds();
            } else if (choice.equals("6")) {
                System.out.println("Program ended.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}