package com.technostack.example.predicate;

import java.util.function.Predicate;

public class Predicate_As_Function_Parameter {

	// Java Stream How to - Use Predicate as function parameter

	public static void main(String[] args) {
		boolean check = checkVisaCode(s -> (s > 400), 500);
		System.out.println("Value check" + " " + check);
	}

	// we are creating a function that accepts predicate as a parameter
	public static boolean checkVisaCode(Predicate<Integer> pred, Integer param) {

		return pred.test(param);
	}
}
