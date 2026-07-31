import java.util.Scanner;

public class StudentAdmissionSystem {

    static class Student {
        String name;
        int age;
        double cgpa;

        public Student(String name, int age, double cgpa) {
            this.name = name;
            this.age = age;
            this.cgpa = cgpa;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("CGPA: " + cgpa);
            System.out.println("--------------------");
        }
    }

    Student[] students = new Student[100];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    void addStudent() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter CGPA: ");
        double cgpa = Double.parseDouble(sc.nextLine());

        students[count] = new Student(name, age, cgpa);
        count++;

        System.out.println("Student added.");
    }

    void displayStudents() {
        if (count == 0) {
            System.out.println("No students yet.");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    void searchStudent() {
        if (count == 0) {
            System.out.println("No students yet.");
            return;
        }

        System.out.print("Enter name to search: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].name.toLowerCase().contains(keyword)) {
                students[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching student found.");
        }
    }

    void menu() {
        while (true) {
            System.out.println("\n--- Student Admission System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                displayStudents();
            } else if (choice == 3) {
                searchStudent();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Wrong choice.");
            }
        }
    }

    public static void main(String[] args) {
        StudentAdmissionSystem system = new StudentAdmissionSystem();
        system.menu();
    }
}