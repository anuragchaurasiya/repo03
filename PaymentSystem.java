package MyProfile;

abstract class PaymentMethod {
    protected final double amount;

    PaymentMethod(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.amount = amount;
    }

    abstract void pay();

    void paymentStatus() {
        System.out.println("Payment processing...");
    }
}

class UpiPayment extends PaymentMethod {
    UpiPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment method: UPI");
        System.out.printf("Amount: ₹%.2f%n", amount);
    }
}

class CreditCardPayment extends PaymentMethod {
    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment method: Credit Card");
        System.out.printf("Amount: ₹%.2f%n", amount);
    }
}

class NetBankingPayment extends PaymentMethod {
    NetBankingPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment method: Net Banking");
        System.out.printf("Amount: ₹%.2f%n", amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod upi = new UpiPayment(2000);
        PaymentMethod creditCard = new CreditCardPayment(5000);
        PaymentMethod netBanking = new NetBankingPayment(10000);

        upi.paymentStatus();
        upi.pay();

        System.out.println();

        creditCard.paymentStatus();
        creditCard.pay();

        System.out.println();

        netBanking.paymentStatus();
        netBanking.pay();
    }
}