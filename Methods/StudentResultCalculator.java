// Student Result Calculator using methods
import java.util.Scanner;

public class StudentResultCalculator {

    static String studentName;
    static int m1, m2, m3;
    static double percentage;

    static void enterStudentDetails(Scanner sc) {
        System.out.println("=== Enter Student Details ===");
        System.out.print("Enter student name: ");
        studentName = sc.nextLine(); 

        System.out.print("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        m3 = sc.nextInt();

        sc.nextLine();

        System.out.println("Details saved.\n");
    }

    static void calculatePercentage() {
        int total = m1 + m2 + m3;
        percentage = total / 3.0;

        System.out.println("=== Percentage ===");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%\n");
    }

    static void displayGrade() {
        System.out.println("=== Grade ===");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        System.out.println();
    }

    static void showMenu() {
        System.out.println("=== Student Result Calculator ===");
        System.out.println("1. Enter Student Details");
        System.out.println("2. Calculate Percentage");
        System.out.println("3. Display Grade");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    enterStudentDetails(sc);
                    break;

                case 2:
                    calculatePercentage();
                    break;

                case 3:
                    displayGrade();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        }

        sc.close();
    }
}