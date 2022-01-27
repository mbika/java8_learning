package com.technostack.example.consumer;

import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo7 {

	public static void main(String[] args) {
		
		Consumer<String> showThreeTimes = value-> {
			System.out.println(value);
			System.out.println(value);
			System.out.println(value);
		};
		
		showThreeTimes.accept("Apple Laptop");
		System.out.print("====================");
		System.out.println();
		showThreeTimes.accept("Windows Laptop");
	}
}
