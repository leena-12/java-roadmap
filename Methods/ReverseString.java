// Reverses a string using a method
import java.util.Scanner;

public class ReverseString {

    static String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}