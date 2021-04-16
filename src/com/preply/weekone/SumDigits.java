package com.preply.weekone;

public class SumDigits {
	
	static void sumDigits(int n) {

		int remider;
		int sumDigits = 0;

		while (n > 0) {
			remider = n % 10;
			n = n / 10;
			sumDigits = sumDigits + remider;
		}

		System.out.println("sumDigits: " + sumDigits);
	}

}
