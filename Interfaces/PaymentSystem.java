import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Cash");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new UPIPayment();
        } else if (choice == 2) {
            payment = new CardPayment();
        } else if (choice == 3) {
            payment = new CashPayment();
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        payment.pay(amount);

        if (payment instanceof Refundable) {
            Refundable refundable = (Refundable) payment;
            refundable.refund(amount);
        } else {
            System.out.println("This payment method does not support refunds.");
        }

        input.close();
    }
}
