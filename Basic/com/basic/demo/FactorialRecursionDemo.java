package com.basic.demo;

public class FactorialRecursionDemo {
	static int factorial;

	static int factorialMethod(int num) {
		if (num == 0)
			return 1;
		else
			return (num * factorialMethod(num - 1));
	}

	public static void main(String[] args) {
		int num = 7, fact;
		fact = factorialMethod(num);
		System.out.println("Factorial of number is " + fact);

	}

}
