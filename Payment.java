package MyProfile;
class  Account{
	void pay() {
		System.out.println("Pay");
	}
}
class CreditCardPayment extends Account {
	void pay() {
		System.out.println("pay for CreditCardPayment ");
	}
	
}
class UpiPayment extends Account{
	void pay() {
		System.out.println("pay for UpiPayment");
	}
}
class CashPayment extends Account{
	void pay() {
		System.out.println("pay for CashPayment");
	}
}
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account A=new CreditCardPayment();
Account A1=new UpiPayment();
Account A2=new CashPayment();
A.pay();
A1.pay();
A2.pay();
	}

}
