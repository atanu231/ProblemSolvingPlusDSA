package com.atanu.algorithm.search;

import java.util.Currency;

public class KADANEAlgo_MaxSumSubArray {
	/*
	 * KADANEs Algorithm states that : if sum of nos are -ve then consider it as 0
	 * If Max sum < Current sum, MAxsum= currrent sum
	 */
	public static void main(String[] args) {
		int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
		int maxSum = maxSumSubArray(array);
		System.out.println("Max Sum: " + maxSum);
		
		int minSum = minSumSubArray(array);
		System.out.println("Min Sum: " + minSum);
	}

	private static int minSumSubArray(int[] array) {
		int curSum =0;
		int minSum = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			curSum += array[i];
			if(curSum > 0)
				curSum = 0;
			minSum = Math.min(curSum, minSum);
		}
		return minSum;
	}

	private static int maxSumSubArray(int[] array) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			curSum += array[i];
			if (curSum < 0)
				curSum = 0;
			maxSum = Math.max(curSum, maxSum);
		}
		return maxSum;
	}

}
