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

class UpiOption extends PaymentMethod {
    UpiOption(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment method: UPI");
        System.out.printf("Amount: ₹%.2f%n", amount);
    }
}

class CardOption extends PaymentMethod {
    CardOption(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Payment method: Credit Card");
        System.out.printf("Amount: ₹%.2f%n", amount);
    }
}

class NetBankingOption extends PaymentMethod {
    NetBankingOption(double amount) {
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
        PaymentMethod upi = new UpiOption(2000);
        PaymentMethod card = new CardOption(5000);
        PaymentMethod netBanking = new NetBankingOption(10000);

        upi.paymentStatus();
        upi.pay();

        System.out.println();

        card.paymentStatus();
        card.pay();

        System.out.println();

        netBanking.paymentStatus();
        netBanking.pay();
    }
}