package com.technostack.example.consumer;

import java.util.function.Consumer;

public class IntConsumer_FIDemo1 {

	public static void main(String[] args) {

		Consumer<Integer> multiplyBy100 = value -> {

			System.out.println(value * 100);

		};
		multiplyBy100.accept(2);
		multiplyBy100.accept(3);
		multiplyBy100.accept(4);

		System.out.print("=====================");
		System.out.println();
		Consumer<Integer> multiplyBy500 = consumer -> System.out.println(consumer * 500);

		multiplyBy500.accept(2);
		multiplyBy500.accept(3);
		multiplyBy500.accept(4);
	}
}
