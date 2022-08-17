package com.atanu.algorithm.search;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// Odd length array
		//int[] array = { 1, 3, 5, 7, 8 };
		
		// Even length Array
		int[] array = { 1, 3, 5, 7, 8 ,2};
		
		// Reverse array
		reverseArray(array);
		System.out.println("Reversed Array is : "+ Arrays.toString(array));
	}

	private static void reverseArray(int[] array) {
		int firstIndex = 0;
		int lastIndex = array.length - 1;
		/*
		 * F-> firstIndex
		 * L -> lastIndex
		 * loop until F<L
		 *  1     3     5     7     8
		 *  F                       L  step 1 swap
		 *        F           L        step 2 swap
		 *              FL             step 3 no swap because F=L
		 * 
		 */
		
		
		while (firstIndex < lastIndex) {
			//Swapping
			int temp = array[firstIndex];
			array[firstIndex] = array[lastIndex];
			array[lastIndex] = temp;
			
			// Increase RIGHT side: FirstIndex +1 which points to next element
			firstIndex++;
			
			// Decrease LEFT side: lastIndex by -1 points to previous element
			lastIndex--;
		}
	}

}
