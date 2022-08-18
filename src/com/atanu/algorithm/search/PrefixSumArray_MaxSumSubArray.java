package com.atanu.algorithm.search;

public class PrefixSumArray_MaxSumSubArray {
	/*
	 * This Prefix Sum Array technique is faster execution than Brute force Its Time
	 * complexity is O(n^2)
	 * 
	 */
	public static void main(String[] args) {
		// Actual array
		int actualArr[] = { 1, -2, 6, -1, 3 };
		int arrLength = actualArr.length;

		// Prefix Sum array
		int prefixSumArr[] = new int[arrLength];
		int maxsum = Integer.MIN_VALUE;

		// Push 1st element in the prefix array
		prefixSumArr[0] = actualArr[0];

		// Data push into prefix Sum Array
		// For first Prefix Sum formula
		// prefix[i-1] + array[i]
		for (int i = 1; i < arrLength; i++) {
			prefixSumArr[i] = prefixSumArr[i - 1] + actualArr[i];
		}
		int start = 0;
		int end = 0;
		int currSum = 0;
		// Loop for Sub arrays
		for (int i = 0; i < arrLength; i++) {
			start = i;
			for (int j = i; j < arrLength; j++) {
				end = j;

				// PREFIX SUM FORMULA
				// prefix[end] - prefix[start-1]
				currSum = (start == 0) ? prefixSumArr[end] : prefixSumArr[end] - prefixSumArr[start - 1];
				if (maxsum < currSum)
					maxsum = currSum;
			}
		}
		System.out.println("Max Sum: " + maxsum);

	}

}
