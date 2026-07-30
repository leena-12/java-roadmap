public class Student {
    String name;
    int age;
    double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void introduce() {
        System.out.println("Hi, I am " + name +
                           ", " + age + " years old, CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("leena", 19, 9.76);
        s1.introduce();
    }
}