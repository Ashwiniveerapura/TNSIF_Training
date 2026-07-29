package org.tnsif.acc.c2tc.opps;
class Employee
{
	void company()
	{
		System.out.println("company:TNSIF");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role:software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role:QA Tester");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer dp = new Developer();
		dp.company();
		dp.role();
		Tester ts = new Tester();
		ts.company();
		ts.role();

	}

}
