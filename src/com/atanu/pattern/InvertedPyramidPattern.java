package com.atanu.pattern;

public class InvertedPyramidPattern {

	public static void main(String[] args) {
		/*
		 *       *
		 *     * *
		 *   * * *
		 * * * * *  
		 */
		int rows=4,cols=4;
		//createInvertedPyramid(rows,cols);
		anotherapproach(rows,cols);
	}

	private static void anotherapproach(int rows, int cols) {
		for(int i =1; i<=rows;i++) {
			for(int k =1; k<=rows-i;k++) {
				System.out.print("   ");
			}
			for(int j =1; j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	private static void createInvertedPyramid(int rows, int cols) {
		for(int i=1; i<=rows;i++) {
			for(int j=cols;j>=1;j--) {
				if(j<=i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
