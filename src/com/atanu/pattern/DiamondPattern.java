package com.atanu.pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		/*
		 * 
		 *       *
		 *     * * *
		 *   * * * * *
		 * * * * * * * *
		 * * * * * * * * 
		 *   * * * * *  
		 *     * * *
		 *       * 
		 * 
		 */
		int n=4;
		for(int i=1;i<=n;i++) {
			createDiamondPattern(n,i);
		}
		for(int i=n;i>=1;i--) {
			createDiamondPattern(n,i);
		}
	}

	private static void createDiamondPattern(int n, int i) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("   ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print(" * ");
		}
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}
		System.out.println();
	}

}
