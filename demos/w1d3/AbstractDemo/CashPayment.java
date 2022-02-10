
public class CashPayment extends Payment {

	public CashPayment(double amount) {
		super(amount);
	}
	
	public void paymentDetails() {
		System.out.println("Payment method: Cash | Amount : $" + this.amount);
	}
	

}
