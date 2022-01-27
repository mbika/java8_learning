package com.technostack.example.consumer;

import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo4 {
	
	//Note : Create Consumer with Block Statement.

	public static void main(String[] args) {
		Consumer<String> myConsumer_one = value -> {

			System.out.println("Value:" + value);
			System.out.println("New Updated Value:" + value);
		};

		myConsumer_one.accept("My name is Bikash Mohapatra");
	}
}
