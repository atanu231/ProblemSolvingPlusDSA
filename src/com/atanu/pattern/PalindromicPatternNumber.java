package com.atanu.pattern;

public class PalindromicPatternNumber {

	public static void main(String[] args) {
		/*
		 *       1
		 *      212
		 *     32123
		 *    4321234
		 *   543212345    
		 * 
		 */
		
		int n = 7;
		palindromicPatternNumber(n);
		
	}

	private static void palindromicPatternNumber(int n) {
	    // Outer loop
		for(int i=1;i<=n;i++) {
			
			//Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//descending
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//ascending
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
