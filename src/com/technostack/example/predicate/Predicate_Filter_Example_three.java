package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Filter_Example_three {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(2, 4, 45, 67, 2, 9, 14, 16, 47);
		Predicate<Integer> predicateValue = value -> (value > 4);
		List<Integer> myList = integerList.stream().filter(predicateValue).collect(Collectors.toList());
		System.out.println(myList);
	}

}
