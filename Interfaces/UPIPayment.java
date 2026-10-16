public class UPIPayment implements Payment, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs. " + amount + " to UPI.");
    }
}