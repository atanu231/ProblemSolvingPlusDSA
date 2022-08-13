package com.atanu.numberproblem;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		isPalindrome(number);
	}

	private static void isPalindrome(int number) {
		int quotient = number;
		int reverseNo=0;
		while(quotient>0) {
			int r = quotient%10;
			reverseNo = reverseNo * 10+r;
			quotient = quotient/10;
		}
		if(reverseNo==number)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is NOT palindrome");
	}

}
