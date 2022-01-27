package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate_Fileter_Example_one {

	public static void main(String[] args) {
		List<String> stringValue = Arrays.asList("apple", "ball", "cat", "dog", "elephant");

		List<String> getResult = stringValue.stream().filter(value -> value.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println(getResult.toString());
	}

}
