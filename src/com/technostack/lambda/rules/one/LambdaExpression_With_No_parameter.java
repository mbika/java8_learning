package com.technostack.lambda.rules.one;

public class LambdaExpression_With_No_parameter {
	
//Rule No 1 : Parameter are optional.It can be Zero or more.

	public static void main(String[] args) {
		
		Executable myExecutable = () -> {
			return "Labda Expression Example with No parameter Rules";
		};
		System.out.println(myExecutable.execute());
	}
}
