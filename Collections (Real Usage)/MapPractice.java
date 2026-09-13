import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amit");
        students.put(102, "Riya");
        students.put(103, "Sahil");

        System.out.println("Map: " + students);
        System.out.println("Student with ID 102: " + students.get(102));
        System.out.println("Contains ID 101: " + students.containsKey(101));

        students.remove(103);
        System.out.println("After remove: " + students);
    }
}