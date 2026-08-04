public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        setBalance(initialBalance); 
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public void display() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Acc No: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya", "A12345", 1000);
        acc.display();

        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); 

        acc.setBalance(-500);
        acc.setBalance(3000); 
        acc.display();
    }
}
