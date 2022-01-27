package com.technostack.example.predicate;

import java.util.function.Predicate;

//or() is default method which returns composite predicate that denotes 
//logical OR of this predicate and passed predicate.

public class Predicate_Or_Method {

	// Source Learning : https://java2blog.com/java-8-predicate-examples/
	// We have created two predicates and checked logical or between predicate1 and predicate2
	public static void main(String[] args) {
		Predicate<Integer> myPredicate_one = i -> i > 100;
		Predicate<Integer> myPredicate_two = i -> i < 50;

		Predicate<Integer> andPredicate = myPredicate_one.or(myPredicate_two);
		boolean checkRange = andPredicate.test(30);
		System.out.println("(30 > 100) or (30 < 50) returns:" + checkRange);
	}
}
