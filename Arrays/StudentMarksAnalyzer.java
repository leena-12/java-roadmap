// Program to analyze student marks using array
public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 60, 85};

        // 1. Print marks
        System.out.println("Marks of student:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        // 2. Find sum
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // 3. Find average
        double average = (double) sum / marks.length;

        // 4. Find largest mark
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        // 5. Find smallest mark
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // 6. Print results
        System.out.println("Total marks = " + sum);
        System.out.println("Average marks = " + average);
        System.out.println("Highest mark = " + highest);
        System.out.println("Lowest mark = " + lowest);
    }
}