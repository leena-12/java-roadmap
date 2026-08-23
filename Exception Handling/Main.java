public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(5000);

        try {
            atm.withdraw(2000);
            atm.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + atm.getBalance());
    }
}