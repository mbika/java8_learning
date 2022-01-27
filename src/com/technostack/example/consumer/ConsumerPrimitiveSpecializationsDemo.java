package com.technostack.example.consumer;

import java.util.Date;
import java.util.function.Consumer;

public class ConsumerPrimitiveSpecializationsDemo {

	public static void main(String[] args) {

		// IntConsumer
		Consumer<Integer> h1 = i -> System.out.println(i * 200);

		// LongConsumer
		Consumer<Long> h2 = i -> System.out.println(i);

		// DoubleConsumer
		Consumer<Double> h3 = i -> System.out.println(i + 20.0);

		// Boolean Consumer
		Consumer<Boolean> h4 = i -> System.out.println(i);

		
		h1.accept(10);
		h2.accept(new Date().getTime());
		h3.accept(10.0);
		h4.accept(10%2==0);
	}
}
