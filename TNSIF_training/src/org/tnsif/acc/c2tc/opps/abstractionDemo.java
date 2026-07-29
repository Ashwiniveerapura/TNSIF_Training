package org.tnsif.acc.c2tc.opps;

public class abstractionDemo {

	public static void main(String[] args) {
		AshwiniDemo  obj = new Ramesh();
		obj.calling();
		obj.aiIntegration();
		obj.satellitecomm();
		obj.healthMonitoring();
		
	}

}
abstract class AshwiniDemo 
{
	void calling()
	{
		System.out.println("phone is having calling feature");
	}
	abstract void aiIntegration();
	abstract void satellitecomm();
	abstract void healthMonitoring();
}
abstract class Ammu extends AshwiniDemo
{

	@Override
	void aiIntegration() {
		System.out.println("phone is integrated with AIIntegration");
		
	}

	@Override
	abstract void satellitecomm();

	@Override
	abstract void healthMonitoring();
	
}
class Ramesh extends Ammu{

	@Override
	void satellitecomm() {
		System.out.println("phone is integrated with satellitecomm");
		
	}

	@Override
	void healthMonitoring() {
		System.out.println("phone is integrated with healthMonitoring");
		
	}
	
}