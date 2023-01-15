package com.masai.app;

public class Admin implements Users {
	private String username;
	private String password;
	private StudentManager students;

	public Admin(String username, String password,StudentManager students) {
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
	
	public void byClass(String classno) {
		students.findStudentbyClassroom(classno);
	}

	public void byId(int id) {
		System.out.println(students.findStudent(id));
	}
	
	public void totalFees() {
		students.totalFee();
	}

}
