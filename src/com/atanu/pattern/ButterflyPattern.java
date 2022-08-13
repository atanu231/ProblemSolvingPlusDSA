package com.atanu.pattern;

public class ButterflyPattern {

	public static void main(String[] args) {
		/*
		 *  *             *
		 *  * *         * *
		 *  * * *     * * *
		 *  * * * * * * * *
		 *  * * * * * * * *
		 *  * * *     * * *
		 *  * *         * *
		 *  *             *
		 * 
		 */
		butterFlyPattern(5);
	}
	
	private static void butterFlyPattern(int n) {
		for(int i=1;i<=n;i++) {
			//innerButterflyloop(n,i);
			//secondApproachButterflyloop(n,i);
			thirdApproachButterflyloop(n,i);
		}
		for(int i=n;i>=1;i--) {
			//innerButterflyloop(n,i);
			//secondApproachButterflyloop(n,i);
			thirdApproachButterflyloop(n,i);
		}
			
	}
	private static void thirdApproachButterflyloop(int n, int i) {
		/*
		 * 
		 *  * - - - - - - *
		 *  * * - - - - * *
		 *  * * * - - * * *
		 *  * * * * * * * *
		 *  * * * * * * * *
		 *  * * * - - * * *
		 *  * * - - - - * *
		 *  * - - - - - - *
		 *       
		 *       
		 *       Starts + spaces + stars
		 * loop:   i      2*(n-i)    i
		 * 
		 */
		
		//stars
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		
		//spaces
		for(int j=1;j<=2*(n-i);j++) {
			System.out.print("   ");
		}
		
		//stars
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

	private static void innerButterflyloop(int n,int i) {
		/*
		 *  *       |       *
		 *  * *     |     * *
		 *  * * *   |   * * *
		 *  * * * * | * * * *
		 *  -----------------
		 *  * * * * | * * * *
		 *  * * *   |   * * *
		 *  * *     |     * *
		 *  *       |       *
		 * 
		 */
		
		
		for(int j=1;j<=n;j++) {
			if(j<=i)
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		for(int j=n;j>=1;j--) {
			if(j<=i)
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println();
	
	}
	
	private static void secondApproachButterflyloop(int n,int i) {
		int cols = n*2;
		for(int j=1;j<=cols;j++) {
			if(j<=i || (cols-j+1)<=i)
				System.out.print(" * ");
			else
				System.out.print("   ");
		}
		System.out.println();
	
	}
}
