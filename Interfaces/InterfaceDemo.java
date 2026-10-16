public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment1 = new UPIPayment();
        Payment payment2 = new CardPayment();
        Payment payment3 = new CashPayment();

        payment1.pay(500);
        payment2.pay(1000);
        payment3.pay(250);
    }
}