public class Student {
    
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        setAge(age);     
        setMarks(marks); 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks (0–100 allowed).");
        }
    }

    public void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 20, 85.5);
        s1.display();

        s1.setMarks(95); 
        s1.display();
    }
}