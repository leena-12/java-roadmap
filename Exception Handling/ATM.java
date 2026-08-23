public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdraw successful. Remaining balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}