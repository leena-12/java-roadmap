public class CardPayment implements Payment, Refundable {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded Rs. " + amount + " to Card.");
    }
}