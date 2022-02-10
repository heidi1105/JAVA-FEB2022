
public class PaymentTest {

	public static void main(String[] args) {
//		Payment macbook = new Payment(2000);

		CashPayment catfood = new CashPayment(10);
		catfood.paymentDetails();
		
		CreditCardPayment macbook = new CreditCardPayment("********1234", "Heidi Chen" , "08/21", 2000);
		macbook.paymentDetails();
		
		
	}

}
