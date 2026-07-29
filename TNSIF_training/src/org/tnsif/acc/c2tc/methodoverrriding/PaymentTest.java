package org.tnsif.acc.c2tc.methodoverrriding;
class Payment {
	void makePayment()
	{
		System.out.println("processing payment using generic method");
	}
}
class UpiPayment extends Payment {
	void makePayment ()
	{
		System.out.println("payment is done using UPI");
	}
	
}
class CardPayment extends Payment {
	void makePayment ()
	{
		System.out.println("payment is done using credit/debit card");
	}
}
class WalletPayment extends Payment {
	void makePayment ()
	{
		System.out.println("payment is made using walletPayment ");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment  ;//reference parent class
		
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		
	}

}
