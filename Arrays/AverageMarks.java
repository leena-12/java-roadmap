// Program to calculate average marks of a student
public class AverageMarks {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 60, 85};

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        double average = (double) sum / marks.length;

        System.out.println("Total marks = " + sum);
        System.out.println("Average marks = " + average);
    }
}