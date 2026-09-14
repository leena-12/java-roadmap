import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDirectory {
    static class Student {
        int id;
        String name;
        String branch;
        double marks;

        Student(int id, String name, String branch, double marks) {
            this.id = id;
            this.name = name;
            this.branch = branch;
            this.marks = marks;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name
                    + ", Branch: " + branch + ", Marks: " + marks;
        }
    }

    static HashMap<Integer, Student> students = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (students.containsKey(id)) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter marks: ");
        double marks = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, branch, marks);
        students.put(id, student);
        System.out.println("Student added successfully.");
    }

    static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        Student student = students.get(id);

        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    static void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("All Students:");

        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    static void displayStudentIds() {
        if (students.isEmpty()) {
            System.out.println("No student IDs found.");
            return;
        }

        System.out.println("Student IDs:");

        Iterator<Integer> iterator = students.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Student Directory =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Students");
            System.out.println("5. Display Student IDs");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent();
            } else if (choice.equals("2")) {
                searchStudent();
            } else if (choice.equals("3")) {
                removeStudent();
            } else if (choice.equals("4")) {
                displayStudents();
            } else if (choice.equals("5")) {
                displayStudentIds();
            } else if (choice.equals("6")) {
                System.out.println("Program ended.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
