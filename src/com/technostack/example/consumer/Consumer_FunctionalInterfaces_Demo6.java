package com.technostack.example.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo6 {

	// Note : In this example we are going to Learn "how to pass Consumer as
	// parameter".

	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(new Employee("Bikash", "IT", "CVXZ", "Monideepp Roy"),
				new Employee("Akash", "Software Designer", "CXBBV", "Bikash Mohapatra"),
				new Employee("Pintu", "Civil Enginner", "CFFCX", "Tribhuwan Mohapatra"));

		printAllEmployeeData(employee, emp -> {
			System.out.println(emp.getEmpName() + ":" + emp.getEmpDepartment() + ":" + emp.getEmpSerialCode() + ":"
					+ emp.getEmpManagerName());
		});

	}

	public static void printAllEmployeeData(List<Employee> employee, Consumer<Employee> myConsumer) {
		for (Employee e : employee) {
			myConsumer.accept(e);
		}
	}
}
