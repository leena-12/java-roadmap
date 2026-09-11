import java.util.*;

public class CollectionChoice {
    static class Student {
        int id;
        String name;
        double marks;

        Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
        }
    }

    static HashMap<Integer, Student> students = new HashMap<>();
    static HashSet<Integer> ids = new HashSet<>();
    static ArrayDeque<String> activityQueue = new ArrayDeque<>();
    static Scanner scanner = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (ids.contains(id)) {
            System.out.println("This ID already exists.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        double marks = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, marks);

        students.put(id, student);
        ids.add(id);
        activityQueue.add("Added student " + id);

        System.out.println("Student added successfully.");
    }

    static void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (students.containsKey(id)) {
            students.remove(id);
            ids.remove(id);
            activityQueue.add("Removed student " + id);

            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        Student student = students.get(id);

        if (student != null) {
            System.out.println(student);
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

        Iterator<Student> iterator = students.values().iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addStudent();
            } else if (choice.equals("2")) {
                removeStudent();
            } else if (choice.equals("3")) {
                searchStudent();
            } else if (choice.equals("4")) {
                displayStudents();
            } else if (choice.equals("5")) {
                System.out.println("Program ended.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}