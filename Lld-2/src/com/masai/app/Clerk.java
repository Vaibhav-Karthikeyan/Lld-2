package com.masai.app;

public class Clerk implements Users {
	private String username;
	private String password;
	private StudentManager students;

	public Clerk(String username, String password,StudentManager students) {
		super();
		this.username = username;
		this.password = password;
		this.students=students;
	}

	@Override
	public boolean login(String username, String password) {
		if (this.username == username && this.password == password)
			return true;
		return false;
	}

	@Override
	public boolean logout() {
		return true;
	}

	public boolean addStudent(int id, String name, double fee, String classno) {
		return students.addStudent(id, name, fee, classno);
	}

	public boolean addStudent(Student student) {
		return students.addStudent(student);
	}

	public Boolean addFee(int id, double fee) {
		Student student = students.findStudent(id);
		int x = student.getInstallment();
		if (x == 3 && fee != student.getFee()) {
			System.out.println("pay all remaining fee in 4th installment");
			return false;
		}
		student.setInstallment(x+1);
		student.setFee(student.getFee() - fee);
		student.setPaid(student.getPaid()+fee);
		if (student.getFee() <= 0)
			System.out.println("Fully paid");
		else
			System.out.println("remaining fee=" + student.getFee());
		return true;
	}

	public void seeFee(int id) {
		Student student = students.findStudent(id);
		System.out.println("remaining fee=" + student.getFee() + student.getInstallment() + "installemnt");
	}

	public void byClass(String classno) {
		students.findStudentbyClassroom(classno);
	}
}
