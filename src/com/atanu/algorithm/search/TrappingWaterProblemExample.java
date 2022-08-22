package com.atanu.algorithm.search;

public class TrappingWaterProblemExample {
	/*
	 * Given n non -negative integers representing an elevation map where the width
	 * of each bar is 1, compute how much water it can trap after raining
	 */
	public static void main(String[] args) {
//		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] arr = { 4, 2, 0, 3, 2, 5 };
		int n = arr.length;
		int sum = 0;
		// leftBar is to calculate maximum bar at left side
		int leftBar[] = new int[n];

		// rightBar is to calculate maximum bar at right side
		int rightBar[] = new int[n];

		leftBar[0] = arr[0];
		rightBar[n - 1] = arr[n - 1];
		for (int i = 1; i < n; i++) {
			leftBar[i] = Math.max(leftBar[i - 1], arr[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			rightBar[i] = Math.max(rightBar[i + 1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			int min = Math.min(leftBar[i], rightBar[i]);
			int diff = min - arr[i];
			sum += diff;
		}
		System.out.println(sum);

	}

}
