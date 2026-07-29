package org.tnsif.acc.c2tc.methodoverrriding;

class Payment1 {
	void process ()
	{
		System.out.println("Processing payment via standard gateway");
	}
}
class Gpay extends Payment1 {
	void process ()
	{
		System.out.println("processing payment via google pay");
	}
	void CompleteTrsnsaction ()
	{
		super.process();
		process();
	}
	
}

public class SuperWithMethods {

	public static void main(String[] args) {
		Gpay pay = new Gpay();
		pay.CompleteTrsnsaction();
		

	}

}
