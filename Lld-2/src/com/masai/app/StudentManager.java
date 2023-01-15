package com.masai.app;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentManager {
	private HashMap<Integer, Student> students;
	
	public StudentManager() {
		students=new HashMap<>();
	}

	public boolean addStudent(int id, String name, double fee, String classno) {
		if (students.containsKey(id)) {
			return false;
		}
		Student student = new Student(id, name, fee, classno);
		students.put(id, student);
		return true;
	}

	public boolean addStudent(Student student) {
		if (students.containsKey(student.getId())) {
			return false;
		}
		students.put(student.getId(), student);
		return true;
	}

	public boolean removeStudent(int id) {
		if (!students.containsKey(id)) {
			return false;
		}
		students.remove(id);
		return true;
	}

	public Student findStudent(int id) {
		if (!students.containsKey(id)) {
			return null;
		}
		return students.get(id);
	}

	public void findStudentbyClassroom(String classno) {
		for (Entry<Integer, Student> i : students.entrySet()) {
			if (i.getValue().getClassno() == classno) {
				System.out.println(i.getValue());
			}
		}
	}

	public void allStudents() {
		for (Entry<Integer, Student> i : students.entrySet()) {
			System.out.println(i.getValue());
		}
	}
	
	public void totalFee() {
		double fees=0;
		for (Entry<Integer, Student> i : students.entrySet()) {
			fees+=i.getValue().getPaid();
		}
		System.out.println(fees);
	}
}
