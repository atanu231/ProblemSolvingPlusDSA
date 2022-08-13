package com.atanu.pattern;

public class RhombusPattern {

	public static void main(String[] args) {
		/*
		 *      ***** 
		 *     *****
		 *    *****
		 *   *****
		 *  *****
		 *  
		 *      *****
		 *     *   *
		 *    *   *
		 *   *   *
		 *  *****
		 */
		int n = 5;
		for (int i = 1; i <= n; i++) {
			solidRhombusPattern(n, i);
		}
		System.out.println("================");
		for (int i = 1; i <= n; i++) {
			hollowRhombusPattern(n, i);

		}
	}

	private static void hollowRhombusPattern(int n, int i) {
		for (int j = 1; j <= n - i; j++) {
			System.out.print("   ");
		}
		for (int j = 1; j <= n; j++) {
			if (i == 1 || i == n || j == 1 || j == n)
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println();
	}

	private static void solidRhombusPattern(int n, int i) {
		for (int j = 1; j <= n - i; j++) {
			System.out.print("   ");
		}
		for (int j = 1; j <= n; j++) {
			System.out.print(" * ");
		}
		System.out.println();

	}

}
