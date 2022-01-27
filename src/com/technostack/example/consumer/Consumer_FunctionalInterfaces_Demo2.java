package com.technostack.example.consumer;

import java.util.Date;
import java.util.Objects;
import java.util.function.Consumer;

public class Consumer_FunctionalInterfaces_Demo2 {

	public static void main(String[] args) {
		Consumer<String> myConsumer ;
		
	}

	@SuppressWarnings("deprecation")
	public static void wishMessage(String name) {
		Date date = new Date();
		Integer CurrentDate = 27 / 01 / 2022;
		if (Objects.nonNull(name)) {

			if (date.getDate() != CurrentDate) {
				System.out.println("Today is not your birth day" + name);
			} else {
				System.out.println("Today is your Birthday Celebration date.");
			}
		}

	}

}
