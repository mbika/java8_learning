package com.technostack.example.predicate;

import java.util.function.Predicate;

public class Predicate_Test_Method {

	public static void main(String[] args) {
		Predicate<Integer> myPredicate = i -> i > 100;
		boolean condition = myPredicate.test(200);
		System.out.println("200 is greater than condition"+":"+condition);
	}
}
