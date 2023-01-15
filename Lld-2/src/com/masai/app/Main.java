package com.masai.app;

public class Main {

	public static void main(String[] args) {
		StudentManager m1=new StudentManager();
		Clerk c1=new Clerk("user","pass",m1);
		Student s1=new Student(1, "Vaibhav", 50000,"1");
		c1.addStudent(s1);
		c1.addFee(1, 10000);
		c1.addFee(1, 40000);
		Teacher t1=new Teacher("user","pass",m1);
		Student s2=new Student(2, "Ram", 50000,"1");
		t1.addStudent(s2);
		t1.byClass("1");
		c1.addFee(2, 20000);
		c1.addFee(2, 5000);
		c1.addFee(2, 5000);
		c1.addFee(2, 5000);
		Admin a1=new Admin("user","pass",m1);
		a1.totalFees();
	}

}
