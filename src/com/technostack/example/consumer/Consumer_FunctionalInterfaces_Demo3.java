package com.technostack.example.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo3 {
	
	//Note : Here we are using a forEach method to print the data in ArrayList.
	//But internally the forEach method takes consumer as a method parameter.

	public static void main(String[] args) {
		List<String> dataList = Arrays.asList("apple","ball","cat","dog","elephant");
		Consumer<String> myConsumer = value -> System.out.println("Printing data:"+value);
		
		dataList.stream().forEach(myConsumer);
	}
}
