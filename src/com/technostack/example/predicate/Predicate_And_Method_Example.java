package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_And_Method_Example {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(3, 5, 67, 56, 78, 89, 90);

		Predicate<Integer> greaterThan3 = x -> x > 3;
		Predicate<Integer> lessThanorEqualTo90 = x -> x <= 90;

		List<Integer> resultList = myList.stream().filter(greaterThan3.and(lessThanorEqualTo90))
				.collect(Collectors.toList());
		System.out.println("Result List" + resultList);
	}
}
