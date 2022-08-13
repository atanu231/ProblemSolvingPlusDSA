package com.atanu.numberproblem;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int factorial = n;
		for (int i = 1; i < n; i++) {
			factorial *= (n - i);
		}
		System.out.println("Factorial:" + factorial);

	}

}
