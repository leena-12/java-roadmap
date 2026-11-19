class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    private String rollNo;
    private double cgpa;

    public Student(String name, int age, String rollNo, double cgpa) {
        super(name, age);
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("CGPA   : " + String.format("%.2f", cgpa));
    }

    public void showStudentDetails() {
        System.out.println("----- Student Details -----");
        display();
    }

    public static void main(String[] args) {
        Person person = new Person("Aman", 21);
        Student student = new Student("Priya", 20, "CS001", 9.2);

        System.out.println("===== Person Details =====");
        person.display();

        System.out.println();

        student.showStudentDetails();
    }
}