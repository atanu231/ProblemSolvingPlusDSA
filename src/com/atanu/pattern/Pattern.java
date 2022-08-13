package com.atanu.pattern;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series no:");
		int n = sc.nextInt();

		 trianglePattern(n);
		// butterFlyPattern(n);
		//solidRhombusPattern(n);
	}

	private static void solidRhombusPattern(int n) {
		for (int i = 0; i < n; i++) {
			createRhombusPattern(i, n);
		}
	}

	private static void createRhombusPattern(int i, int n) {
		// To count (upper edge + lower edge, stars excluding common star) +common star
		int count = n * 2 - 1;

		// To count left and right side of the common star
		int div = count / 2;

		for (int j = 1; j <= count; j++) {
			if (j < (count - div - i) || (count - j) < i)
				System.out.print("   ");
			else {
				if ((i == 0 || i == n - 1) || (j == (count - div-i) || (count - j) == i))
				System.out.print(" * ");
				else
					System.out.print("   ");
			}
		}
		System.out.println("");
	}

	private static void butterFlyPattern(int n) {
		int div = n / 2;
		int remainingDiv = 0;
		if (n % 2 == 0)
			remainingDiv = div;
		else
			remainingDiv = div + 1;
		for (int i = 1; i <= div; i++) {
			createbutterflyPattern(i, n);
		}
		for (int i = remainingDiv; i >= 1; i--) {
			createbutterflyPattern(i, n);
		}

	}

	private static void createbutterflyPattern(int i, int n) {
		for (int j = 1; j <= n; j++) {
			if ((j <= i) || (n - j < i))
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println("");
	}

	private static void trianglePattern(int n) {
		/*
		 * Triangle Pattern 1 0 1 1 0 1 0 1 0 1 1 0 1 0 1
		 */

		for (int i = 1; i <= n; i++) {
			createTrianglePattern(i);
		}
	}

	private static void createTrianglePattern(int i) {
		for (int j = i; j >= 1; j--) {
			int r = j % 2;
			System.out.print(" " + r + " ");
		}
		System.out.println("");
	}

}
