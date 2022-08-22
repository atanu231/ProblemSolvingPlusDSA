package com.atanu.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
	/*
	 * 1> Bubble sort has two loop. 2> Outer loop iterates up to n-2 to consider
	 * (n-1) element to consider for swapping 3> Inner loop iterates up to n-i-2 to
	 * improve performance by knowing that last elements are sorted. No need to
	 * iterate up to last element.Only iterate the UNSORTED elements. 4> isSwapped
	 * is checking for already sorted array. if isSwapped = false means inner loop
	 * is not executed i.e no swapping happened i.e already sorted. 5> Time
	 * Complexity O(n^2)
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 8, 2, 1 };
		int n = arr.length;

		// Outer loop
		for (int i = 0; i <= n - 2; i++) {
			boolean isSwapped = false;

			// Inner loop to iterate adjucent elements and swapping if required.
			for (int j = 0; j <= n - i - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
		System.out.println("Bubble sorted in ascending order: "+Arrays.toString(arr));
	}

	private static void swap(int[] arr, int current, int next) {
		int temp = arr[next];
		arr[next] = arr[current];
		arr[current] = temp;
	}

}
