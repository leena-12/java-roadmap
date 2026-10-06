import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, "Ravi", 78.5));
        students.add(new Student(101, "Aman", 92.0));
        students.add(new Student(102, "Priya", 85.5));

        Collections.sort(students);

        System.out.println("Students sorted by natural order (marks):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}