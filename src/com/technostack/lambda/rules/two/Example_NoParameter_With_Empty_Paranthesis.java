package com.technostack.lambda.rules.two;

public class Example_NoParameter_With_Empty_Paranthesis {

//Rule No 2 : If no parameters are available then we need to use empty parenthesis ().
	public static void main(String[] args) {
		Executable myExecute = () -> {
			System.out.println("No Parameter Example with Empty Paranthesis");
		};
		myExecute.execute();
	}
}
