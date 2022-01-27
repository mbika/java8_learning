package com.technostack.example.predicate;

import java.util.function.Predicate;

public class CheckPredicate_As_Function_Parameter2 {

	public static void main(String[] args) {

		boolean checkCondition = cheeckValueisGreaterOrNot(value -> (value > 200), 400);
		System.out.println("Based on Function condition value is identified as" + ":" + checkCondition);

	}

	public static boolean cheeckValueisGreaterOrNot(Predicate<Integer> parameter, Integer value) {
		return parameter.test(value);
	}
}
