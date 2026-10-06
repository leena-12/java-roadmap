import java.util.ArrayList;
import java.util.Comparator;

public class StudentSorter {
    public static void printStudents(String title, ArrayList<Student> students) {
        System.out.println("\n" + title);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Ravi", 78.5));
        students.add(new Student(101, "Aman", 92.0));
        students.add(new Student(104, "Neha", 92.0));
        students.add(new Student(102, "Priya", 85.5));

        // Comparable: natural ordering by marks, highest first.
        students.sort(null);
        printStudents("Sorted by marks (highest first):", students);

        // Comparator: custom ordering by name.
        students.sort(Comparator.comparing(Student::getName));
        printStudents("Sorted by name (A-Z):", students);

        // Comparator: custom ordering by ID.
        students.sort(Comparator.comparingInt(Student::getId));
        printStudents("Sorted by ID:", students);
    }
}