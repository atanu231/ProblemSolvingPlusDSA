package com.atanu.algorithm.search;

public class PairInArray {

	public static void main(String[] args) {
		int[] array = {2,4,8,6,10};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				System.out.print("("+array[i]+","+array[j]+") ");
			}
			System.out.println();
		}
	}

}
