package com.atanu.numberproblem;
import java.util.Scanner;

public class SumOFEvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers:");
		int size = sc.nextInt();
		int evenSum=0, oddSum = 0;
		int i = 1;
		while (i <= size) {
			System.out.println("Enter Number:");
			int number = sc.nextInt();
			if (number % 2 == 0)
				evenSum += number;
			else
				oddSum += number;
			i++;
		}
		System.out.println("Sum of Even Numbers:"+ evenSum);
		System.out.println("Sum of Odd Numbers:"+ oddSum);
	}

}
