package com.atanu.numberproblem;
import java.util.Scanner;

public class MultiplicationTableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Multipleication Table of  the number:");
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				int factor = n / i;
				System.out.println(i + "*" + factor);
			}

		}

	}

}
