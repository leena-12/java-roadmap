import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Amit");
        students.put(102, "Riya");
        students.put(103, "Sahil");

        System.out.println("Student with ID 102: " + students.get(102));

        System.out.println("All students:");
        Iterator<Integer> iterator = students.keySet().iterator();
        while (iterator.hasNext()) {
            Integer id = iterator.next();
            System.out.println(id + " - " + students.get(id));
        }

        students.remove(103);
        System.out.println("After removing ID 103: " + students);
    }
}