import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<String> subjects = new HashSet<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Java");

        System.out.println("Set: " + subjects);
        System.out.println("Contains Java: " + subjects.contains("Java"));

        subjects.remove("Python");
        System.out.println("After remove: " + subjects);
    }
}