package com.technostack.example.consumer;

public class Student {

	private int studentId;
	private String name;
	private String address;
	private String gender;

	public Student() {

	}

	public Student(int studentId, String name, String address, String gender) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ "]";
	}

}
