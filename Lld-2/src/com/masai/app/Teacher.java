package com.masai.app;

public class Teacher implements Users {
	private String username;
	private String password;
	private StudentManager students;

	public Teacher(String username, String password,StudentManager students) {
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

	public void seeFee(int id) {
		Student student = students.findStudent(id);
		System.out.println("remaining fee=" + student.getFee() + student.getInstallment() + "installemnt");
	}

	public void byClass(String classno) {
		students.findStudentbyClassroom(classno);
	}

}
