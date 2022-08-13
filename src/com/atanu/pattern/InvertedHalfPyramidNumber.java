package com.atanu.pattern;

public class InvertedHalfPyramidNumber {

	public static void main(String[] args) {
		/*
		 *  1 2 3 4 5
		 *  1 2 3 4
		 *  1 2 3
		 *  1 2
		 *  1
		 */
		
		int rows=5;
		createIHPNumber(rows);
		System.out.println("======================");
		anotherapproachIHPNumber(rows);
	}

	private static void anotherapproachIHPNumber(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int k=1; k<=rows-i+1;k++) {
				System.out.print(" "+k+" ");
			}
			System.out.println("");
		}
	}

	private static void createIHPNumber(int rows) {
		for(int i=0;i<rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(j<=rows-i)
					System.out.print(" "+j+" ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
