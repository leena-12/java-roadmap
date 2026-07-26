// Finds the square of a number using a method
import java.util.Scanner;

public class Square {


    static int findSquare(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print it's square : ");
        int num = sc.nextInt();

        int sq = findSquare(num);
        System.out.println("Square of " + num + " = " + sq);

        sc.close();
    }
}