package com.technostack.example.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentPredicate_Example {

	public static void main(String[] args) {
		List<Student> myStudentList = createStudentList();

		// Filter all male student who have age > 18
		Predicate<Student> filterStudent = student -> student.getGender().equals("male") && student.getAge() > 18;
		List<Student> studentResultList = myStudentList.stream().filter(filterStudent).collect(Collectors.toList());
		// System.out.print(studentResultList);

		// Filer all female student who have age < 18
		Predicate<Student> filterFemaleStudents = fstudents -> fstudents.getGender().equalsIgnoreCase("FEMALE")
				&& fstudents.getAge() < 18;
		List<Student> filterFemaleResult = myStudentList.stream().filter(filterFemaleStudents)
				.collect(Collectors.toList());
		System.out.println("Getting Female Result" + filterFemaleResult);

	}

	public static List<Student> createStudentList() {
		List<Student> personalStudentList = new ArrayList<>();
		personalStudentList.add(new Student(1, "Bikash", "Mohapatra", "RZ291/17", "Delhi", "Delhi", 1232, "male", 18));
		personalStudentList
				.add(new Student(2, "Akash", "Mohapatra", "RZ292/18", "Bangalore", "Karnataka", 1223, "male", 45));
		personalStudentList
				.add(new Student(3, "Minar", "Mohapatra", "RZ293/19", "Pune", "Maharastra", 1432, "female", 44));
		personalStudentList
				.add(new Student(4, "Trupti", "Mohapatra", "RZ294/20", "Delhi", "Delhi", 1445, "female", 12));
		personalStudentList
				.add(new Student(5, "Himan", "Mohapatra", "RZ295/21", "Malar", "West Bengal", 1678, "female", 23));
		personalStudentList
				.add(new Student(6, "Udoyag", "Mohapatra", "RZ296/22", "Chandigarh", "Punjab", 1890, "male", 44));

		return personalStudentList;
	}
}
