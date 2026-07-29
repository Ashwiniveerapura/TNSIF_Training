package org.tnsif.acc.c2tc.opps;
class device
{
	void deviceType()
	{
		System.out.println("I am electronic device");
	}
}
class phone extends device 
{
	void brand()
	{
		System.out.println("brand:samsung");
	}
}
class SmartPhone extends phone
{
	void feature()
	{
		System.out.println("features,touchscreen,camera,Internet");
	}
}

public class multilevelInheritance {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.deviceType();
		sp.brand();
		sp.feature();			

	}

}
