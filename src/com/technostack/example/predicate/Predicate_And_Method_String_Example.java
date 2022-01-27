package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate_And_Method_String_Example {

	public static void main(String[] args) {
		List<String> myStringList = Arrays.asList("apple", "america", "amsterdam", "ambros", "appetizer", "appron",
				"Bikash");

		List<String> result = myStringList.stream().filter(value -> value.startsWith("B"))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
