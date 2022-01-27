package com.technostack.example.predicate;

public class Student {

	private long studentId;
	private String firstName;
	private String lastName;
	private String addresslineOne;
	private String state;
	private String city;
	private long pinNo;
	private String gender;
	private int age;

	public Student() {

	}

	public Student(long studentId, String firstName, String lastName, String addresslineOne, String state, String city,
			long i, String gender, int age) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresslineOne = addresslineOne;
		this.state = state;
		this.city = city;
		this.pinNo = i;
		this.gender = gender;
		this.age = age;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddresslineOne() {
		return addresslineOne;
	}

	public void setAddresslineOne(String addresslineOne) {
		this.addresslineOne = addresslineOne;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPinNo() {
		return pinNo;
	}

	public void setPinNo(Long pinNo) {
		this.pinNo = pinNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", addresslineOne=" + addresslineOne + ", state=" + state + ", city=" + city + ", pinNo=" + pinNo
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}
