package com.masai.app;

public class Student {
	public int id;
	public String name;
	public double fee;
	public double paid=0;
	public String classno;
	public int installment=0;
	public Student() {
		
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
	}

	public Student(int id, String name, double fee, String classno) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.classno = classno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getClassno() {
		return classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", classno=" + classno + "]";
	}

}
