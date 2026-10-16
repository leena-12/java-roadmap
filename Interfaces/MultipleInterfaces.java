public class MultipleInterfaces {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        CashPayment cash = new CashPayment();

        upi.pay(700);
        upi.refund(200);

        card.pay(1200);
        card.refund(300);

        cash.pay(150);
    }
}