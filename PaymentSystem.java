package MyProfile;
abstract class payment{
	protected double amount;
		payment( double amount){
			this.amount=amount;
		}
		abstract void pay();
		void paymentStatus() {
			System.out.println("Payment processing...");
		}
	}
class UPI_Payment extends payment{
	UPI_Payment (double amount){
	super(amount);
	/@Override
}
void pay() {
	System.out.println("UPI_payment");
	System.out.printf("Amount: ₹%.2f%n", amount);
}
}
class Credit_Card_Payment extends payment{
	Credit_Card_Payment(double amount){
		super(amount);
	}
@Override
void pay() {
	System.out.println("Credit_Card_Payment");
	System.out.printf("Amount: ₹%.2f%n", amount);
}
}
class Net_Banking_Payment extends payment{
	Net_Banking_Payment(double amount){
		super(amount);
	}
	@Override
	void pay() {
		System.out.println("Net_Banking_Payment");
		System.out.printf("Amount: ₹%.2f%n", amount);
	}
}
public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    payment p = new UPI_Payment(200000);
        p.paymentStatus();
        p.pay();

        System.out.println();

        payment p1 = new Credit_Card_Payment(500000);
        p1.paymentStatus();
        p1.pay();

        System.out.println();

        payment p2 = new Net_Banking_Payment(1000000);
        p2.paymentStatus();
        p2.pay();
    }
}