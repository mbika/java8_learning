package com.technostack.example.predicate;

import java.util.function.Predicate;

// and() is default method which returns composite predicate that denotes
//logical AND of this predicate and passed predicate.
public class Predicate_And_Method {

// We have created two predicates and checked logical AND between predicate1 and predicate2	
	
	// source Learning : https://java2blog.com/java-8-predicate-examples/
	public static void main(String[] args) {

		Predicate<Integer> myPredicate_one = i -> i > 100;
		Predicate<Integer> myPredicate_two = i -> i < 300;
		Predicate<Integer> andPredicate = myPredicate_one.and(myPredicate_two);
		boolean checkRange = andPredicate.test(200);
		System.out.println("200 lies between 100 and 300" + ":" + checkRange);
	}
}
