package com.technostack.example.consumer;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo8 {

	public static void main(String[] args) {
		
		
		var words = List.of("apple","ball","cat","dog","elephant");
		
	/*	Consumer<String> myConsumer = value -> {
			System.out.println(value);
		};
		
		words.forEach(myConsumer);
	*/
		
		
		// As forEach methods takes a Consumer and Consumer internally takes an Object.Thats why we are passing
		//new Consumer inside forEach method.
		words.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);				
			}
		});
	}
}
