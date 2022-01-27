package com.technostack.example.consumer;

import java.util.function.Consumer;

public class ConsumerImplMain {

	public static void main(String[] args) {
		Consumer<Integer> consumer = t -> {
			System.out.println("Value will be:" + 2 * t);
		};
		consumer.accept(2);
	}
}
