import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Amit");
        students.add("Leena");
        students.add("Rahul");

        Iterator<String> it = students.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}