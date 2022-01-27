package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Filter_Example_two {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(3, 4, 6, 7, 8, 10, 19, 32);
		Predicate<Integer> myPredicate = value -> (value > 10);

		List<Integer> result = integerList.stream().filter(myPredicate).collect(Collectors.toList());
		System.out.println("Result" + result);
	}
}
