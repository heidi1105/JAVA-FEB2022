
public class CreditCardPayment extends Payment {
	// cardNum, ownerName, expDate
	private String cardNum, ownerName, expDate;
	
	public CreditCardPayment(String cardNum, String ownerName, String expDate, double amount) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	public void paymentDetails() {
		System.out.println("Payment type: Credit Card. Payment amount : $" + this.amount);
		System.out.println("CardNumber: " + this.cardNum + "|  Expire date : "	+ this.expDate + " | Owner Name : " + this.ownerName);
	}
}
