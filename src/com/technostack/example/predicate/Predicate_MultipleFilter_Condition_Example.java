package com.technostack.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate_MultipleFilter_Condition_Example {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(2, 4, 5, 34, 45, 67, 78);
		List<Integer> myDataList = myList.stream().filter(x -> x > 2 && x < 78).collect(Collectors.toList());
		System.out.println("My Data List" + myDataList);

	}
}
