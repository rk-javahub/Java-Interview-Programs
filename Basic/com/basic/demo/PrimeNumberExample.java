/*Program to check number is prime or not*/
package com.basic.demo;

public class PrimeNumberExample {

	public static void main(String[] args) {
		int num = 14, m, i, flag = 0;

		if (num == 1 || num == 0) {
			System.out.println(num + " number is not prime");
		} else {
			m = num / 2;
			for (i = 2; i < m; i++) {
				if (num % i == 0) {
					System.out.println(num + " number is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " number is prime");
			}
		}
	}
}
