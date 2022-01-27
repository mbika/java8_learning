package com.technostack.example.consumer;

import java.util.function.Consumer;

public class Consumer_FunctionInterface_Demo1 {

//	This is a functional interface and can therefore be used as the assignment target 
//  for a lambda expression or method reference.

	public static void main(String[] args) {
		Consumer<String> myConsumer = value -> System.out.println("Name:" + value);

		myConsumer.accept("Bikash Mohapatra");

	}
}
