class Payment {
    void pay(double amount) {
        System.out.println("Making a payment");
    }
}

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using credit card");
    }
}

class Cash extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using cash");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = {
            new UPI(),
            new CreditCard(),
            new Cash()
        };

        for (Payment payment : payments) {
            payment.pay(1000);
        }
    }
}