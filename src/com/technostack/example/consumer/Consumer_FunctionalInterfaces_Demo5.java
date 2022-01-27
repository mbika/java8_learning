package com.technostack.example.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo5 {

	// Note : In this example we are going to Learn "how to pass Consumer as
	// parameter".
	
	
	//Using : Student class Object

	public static void main(String[] args) {
		List<Student> myStudentList = Arrays.asList(new Student(1, "Bikash", "Bangalore", "male"),
				new Student(2, "Akash", "Pune", "male"), new Student(3, "Trupti", "BBSR", "female"));

		showAllStudents(myStudentList, student -> {
			System.out.println(student.getStudentId() + "" + student.getName() + "" + student.getAddress() + ""
					+ student.getGender());
		});
	}

	// we are passing consumer as a parameter inside method argument.So there will
	// no return type which will be only "void"

	public static void showAllStudents(List<Student> myStudent, Consumer<Student> studentConsumer) {
		for (Student studentData : myStudent) {
			studentConsumer.accept(studentData);
		}
	}
}
