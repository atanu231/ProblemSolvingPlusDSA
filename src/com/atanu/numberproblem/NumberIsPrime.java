package com.atanu.numberproblem;
import java.util.Scanner;

public class NumberIsPrime {
	/*
	 * Optimized way. Ex. 12 = (1*12, 2*6, 3*4) ,(4*3, 6*2, 12*1) Observe: factors
	 * are repeating after maximum combination. Also these factors are distributed
	 * exactly 1/2 of the approaches. Which means Square Root of n. For Any n, it is
	 * true n = sqrt(n) * sqrt(n). So our loop will be up to sqrt(n).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n == 2) {
			System.out.println(n + " is prime");
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) // n is multiple of i ( i is not eual to 1 or n itself)
					isPrime = false;
			}
			if (isPrime)
				System.out.println(n + " is prime");
			else
				System.out.println(n + " is not prime");
		}

	}

}
