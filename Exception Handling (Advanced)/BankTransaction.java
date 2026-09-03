import java.util.Scanner;

class NegativeDepositException extends Exception {
    public NegativeDepositException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

public class BankTransaction {
    private double balance = 0;

    public void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0) {
            throw new NegativeDepositException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit successful");
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidWithdrawalException {
        if (amount <= 0) {
            throw new InvalidWithdrawalException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankTransaction bank = new BankTransaction();

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    double amount = sc.nextDouble();
                    bank.deposit(amount);
                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();
                    bank.withdraw(amount);
                } else if (choice == 3) {
                    bank.checkBalance();
                } else if (choice == 4) {
                    System.out.println("Exiting the program!!");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            } catch (NegativeDepositException | InsufficientBalanceException | InvalidWithdrawalException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}