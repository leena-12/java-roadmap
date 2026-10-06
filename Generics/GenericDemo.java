import java.util.ArrayList;
import java.util.HashMap;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Priya");

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(92);

        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Aman", 85);
        studentMarks.put("Priya", 92);

        System.out.println("Names: " + names);
        System.out.println("Marks: " + marks);
        System.out.println("Student marks: " + studentMarks);
    }
}