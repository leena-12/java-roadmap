import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add("Amit");
        students.add("Leena");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("Students: " + students);

        System.out.print("Enter student name to remove: ");
        String removeName = sc.nextLine();
        students.remove(removeName);

        System.out.println("After remove: " + students);

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        if (students.contains(searchName)) {
            System.out.println(searchName + " found");
        } else {
            System.out.println(searchName + " not found");
        }

        System.out.println("Size: " + students.size());

        if (students.size() > 0) {
            System.out.println("First student using get(): " + students.get(0));
        }

        sc.close();
    }
}