package org.tnsif.acc.c2tc.opps;

//parent class
class course
{
	String courseName="Java programming";
	void showCourse()
	{
		System.out.println("course:"+courseName);//instance variable
	}
}

 class Student extends course //sub class
 {
	 String name ="Ashwini";
	 void showStudent()
	 {
		 System.out.println("student:"+name);
		 
	 }
 }
public class singleInheritence{
	public static void main(String[]args) {
		Student student = new Student();
		student.showCourse();
		student.showStudent();
	}
	
	
}
