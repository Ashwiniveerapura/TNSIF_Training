package org.tnsif.acc.c2tc.opps;

public class Human {
	//variables
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public class Encapsulation{

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(21);
		obj.setName("Ashu");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(22);
		obj.setName("Adarsh");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}
		
	}

}
