import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("C++");
        skills.add("Java");
        skills.add("Python");

        System.out.println("Skills: " + skills);
        System.out.println("Size: " + skills.size());

        System.out.println("Contains Java: " + skills.contains("Java"));
        System.out.println("Contains C#: " + skills.contains("C#"));

        skills.remove("C++");
        System.out.println("After remove: " + skills);
    }
}