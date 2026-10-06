import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Ravi", 78.5));
        students.add(new Student(101, "Aman", 92.0));
        students.add(new Student(102, "Priya", 85.5));

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(Comparator.comparingInt(Student::getId));

        System.out.println("\nStudents sorted by ID:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}