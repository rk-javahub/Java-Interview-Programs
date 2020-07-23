/*Program to implement Fibonnacci Series without using recursion*/
package com.basic.demo;

public class FibonacciWithoutRecursion {

	public static void main(String[] args) {
		int n = 12;
		generateFibonacciSeries(n);
	}

	private static void generateFibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		System.out.print(first + "\t" + second + "\t");
		int temp = 0;
		for (int i = 1; i < n; i++) {
			temp = first + second;
			first = second;
			second = temp;
			System.out.print(temp + "\t");
		}
	}
}
