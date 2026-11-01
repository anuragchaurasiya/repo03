// Concepts: inheritance, method overriding, and runtime polymorphism.
package MyProfile;

class Account {
    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Account {
    @Override
    void pay() {
        System.out.println("Payment made by credit card.");
    }
}

class UpiPayment extends Account {
    @Override
    void pay() {
        System.out.println("Payment made by UPI.");
    }
}

class CashPayment extends Account {
    @Override
    void pay() {
        System.out.println("Payment made by cash.");
    }
}

public class Payment {
    public static void main(String[] args) {
        Account creditCard = new CreditCardPayment();
        Account upi = new UpiPayment();
        Account cash = new CashPayment();

        creditCard.pay();
        upi.pay();
        cash.pay();
    }
}