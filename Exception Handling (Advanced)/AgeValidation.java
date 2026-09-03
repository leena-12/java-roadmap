import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void checkAge(int age) throws InvalidAgeException, NotEligibleException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        } else if (age < 18) {
            throw new NotEligibleException("Not eligible: age must be 18 or above");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException | NotEligibleException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}