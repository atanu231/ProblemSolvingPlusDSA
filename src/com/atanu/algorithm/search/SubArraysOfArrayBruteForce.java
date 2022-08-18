package com.atanu.algorithm.search;

import java.util.Arrays;

public class SubArraysOfArrayBruteForce {
	/*
	 * BRUTE FORCE Technique 
	 * Time complexity O(n^3)
	 */
	public static void main(String[] args) {
		// sub array means continuous part of an array
		// No. of Subarray from an Array = n*(n+1)/2.
		int[] array = { 2, 4, 6, 8, 10 };
		int noOfSubArray = array.length * (array.length + 1) / 2;
		int[] sumarrOfSubArr = new int[noOfSubArray];
		int sumCounter = 0;

		int start = 0;
		int end = 0;
		
		//Logic for all the sub arrays
		for (int i = 0; i < array.length; i++) {
			start = i;
			for (int j = i; j < array.length; j++) {
				end = j;
				int sum = 0;
				System.out.print("(");
				for (int k = start; k <= end; k++) {
					System.out.print(array[k] + " ");
					// sum of each sub array elements.
					sum += array[k];
				}
				System.out.print(")");
				
				//Pushing into Array of sum of the sub arrays.
				sumarrOfSubArr[sumCounter] = sum;
				sumCounter++;
			}
			System.out.println();
		}
		System.out.println("Sum Array:"+Arrays.toString(sumarrOfSubArr));
		int max = maxSubarraySum(sumarrOfSubArr);
		int min = minSubarraySum(sumarrOfSubArr);
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}
	
	private static int minSubarraySum(int[] sumarrOfSubArr) {
		int min=sumarrOfSubArr[0];
		for(int i=0;i<sumarrOfSubArr.length;i++) {
			if(min>sumarrOfSubArr[i])
				min=sumarrOfSubArr[i];
		}
		return min;
	}

	private static int maxSubarraySum(int[] sumarrOfSubArr) {
		int max=sumarrOfSubArr[0];
		for(int i=0;i<sumarrOfSubArr.length;i++) {
			if(max<sumarrOfSubArr[i])
				max=sumarrOfSubArr[i];
		}
		return max;
	}

}
