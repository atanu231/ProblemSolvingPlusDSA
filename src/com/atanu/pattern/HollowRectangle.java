package com.atanu.pattern;

public class HollowRectangle {

	public static void main(String[] args) {
		/*
		 *  * * * * *
		 *  *       *
		 *  *       *
		 *  * * * * *
		 */
		int totRows = 4;
		int totCols = 5;
		createHollowRectangle(totRows,totCols);
	}

	private static void createHollowRectangle(int totRows, int totCols) {
		for(int i=1;i<=totRows;i++) {
			for(int j =1;j<=totCols;j++) {
				if(i==1||i==totRows||j==1||j==totCols) {
					System.out.print(" * ");
				}else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
