package com.technostack.lambda.rules.three;

public class Example_LambdaExpression_MultipleParameters {

//Rule No 3 : If we have multiple parameters then need to separate them with a comma(,)
	public static void main(String[] args) {
		Executable myExecutable = (int a,int b) -> {
		    int result = a+b;
		    return result;
		};
		int answer = myExecutable.sumTwoNumbers(10,17);
		System.out.println(answer);
	}
}
