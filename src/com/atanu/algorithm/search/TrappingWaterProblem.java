package com.atanu.algorithm.search;

import java.util.Arrays;

public class TrappingWaterProblem {
	/*
	 * Each block(element) can trap the water only if any of the left side and any
	 * of the right side of the block is greater. thats why two array- leftarray &
	 * right array is taken to store highest no at left side and right side.
	 * 
	 */
	public static void main(String[] args) {
		int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
//		int arr[] = { 3, 1, 2, 4, 0, 1, 3, 2 };
		int sum = 0;
		int leftarr[] = new int[arr.length];
		int rightarr[] = new int[arr.length];
		leftarr[0] = arr[0];
		rightarr[arr.length - 1] = arr[arr.length - 1];
		// left array
		for (int i = 1; i < arr.length; i++) {
			leftarr[i] = Math.max(arr[i], leftarr[i - 1]);
		}

		// right array
		for (int i = arr.length - 2; i >= 0; i--) {
			rightarr[i] = Math.max(arr[i], rightarr[i + 1]);
		}
		System.out.println(Arrays.toString(leftarr));
		System.out.println(Arrays.toString(rightarr));

		// take the smallest between leftarr[i] and right array[i]
		// take the difference between arr[i] and smallest
		// calculate sum
		for (int i = 0; i < arr.length; i++) {
			int smallest = Math.min(leftarr[i], rightarr[i]);
			int diff = Math.abs(smallest - arr[i]);
			sum += diff;
		}
		System.out.println("Total Blocks to trap water: " + sum);
	}

}
