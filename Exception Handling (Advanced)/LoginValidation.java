import java.util.Scanner;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginValidation {
    public static void login(String username, String password) throws InvalidLoginException {
        String correctUsername = "admin";
        String correctPassword = "1234";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            throw new InvalidLoginException("Wrong username or password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            login(username, password);
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}