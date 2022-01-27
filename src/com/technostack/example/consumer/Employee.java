package com.technostack.example.consumer;

public class Employee {

	private String empName;
	private String empDepartment;
	private String empSerialCode;
	private String empManagerName;

	public Employee(String empName, String empDepartment, String empSerialCode, String empManagerName) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSerialCode = empSerialCode;
		this.empManagerName = empManagerName;
	}

	public Employee() {

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpSerialCode() {
		return empSerialCode;
	}

	public void setEmpSerialCode(String empSerialCode) {
		this.empSerialCode = empSerialCode;
	}

	public String getEmpManagerName() {
		return empManagerName;
	}

	public void setEmpManagerName(String empManagerName) {
		this.empManagerName = empManagerName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDepartment=" + empDepartment + ", empSerialCode=" + empSerialCode
				+ ", empManagerName=" + empManagerName + "]";
	}

}
