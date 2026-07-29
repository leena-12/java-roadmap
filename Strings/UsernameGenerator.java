import java.util.Scanner;
import java.util.Random;

public class UsernameGenerator {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        name = name.replace(" ", "");   
        
        name = name.toLowerCase();

        int randomNumber = rand.nextInt(900) + 100; 

        String username = name + randomNumber;

        System.out.println("Generated username: " + username);

        sc.close();
    }
}
