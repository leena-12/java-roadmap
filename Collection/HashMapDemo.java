import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        marks.put("Leena", 85);
        marks.put("A", 72);
        marks.put("B", 91);

        System.out.println("All records: " + marks);

        System.out.print("Enter student name to retrieve marks: ");
        String name = sc.nextLine();
        if (marks.containsKey(name)) {
            System.out.println(name + " marks: " + marks.get(name));
        } else {
            System.out.println("Student not found");
        }

        marks.put("A", 80);
        System.out.println("After update: " + marks);

        System.out.print("Enter student name to remove: ");
        String removeName = sc.nextLine();
        marks.remove(removeName);

        System.out.println("After remove: " + marks);

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        if (marks.containsKey(searchName)) {
            System.out.println(searchName + " exists");
        } else {
            System.out.println(searchName + " not found");
        }

        System.out.println("Names: " + marks.keySet());

        sc.close();
    }
}