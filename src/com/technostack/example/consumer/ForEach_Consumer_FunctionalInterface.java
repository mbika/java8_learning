package com.technostack.example.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Consumer_FunctionalInterface {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		myList.add(30);

		// forEach method internally takes a consumer functional Interface.
		// so we can pass lambda expression.Consumer Functional Interface
		// take input and does not have return type.

		// 1: we can pass a lambda expression to forEach method, as it accepts consumer.
		myList.forEach(value -> System.out.println("Value will be " + 2 * value));
		
		System.out.print("=======================================================");
		System.out.println();

		// 2.Second approach to create Consumer and pass it.
		Consumer<Integer> myConsumer = (Integer value) -> System.out.println(2 * value);
		myList.forEach(myConsumer);
	}
}
