public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Natural ordering: higher marks first
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.marks, this.marks);
    }

    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + '\''
                + ", marks=" + marks + "}";
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "Aman", 92.0);
        Student student2 = new Student(102, "Priya", 85.5);

        System.out.println(student1);
        System.out.println(student2);

        int result = student1.compareTo(student2);

        if (result < 0) {
            System.out.println("Student 2 has higher marks.");
        } else if (result > 0) {
            System.out.println("Student 1 has higher marks.");
        } else {
            System.out.println("Both students have equal marks.");
        }
    }
}
