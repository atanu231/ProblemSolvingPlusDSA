package com.atanu.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 1, 5, 9, 2 };
		int n = arr.length;
		for (int current = 1; current < n; current++) {
			int temp = arr[current];
			int previous = current - 1;
			while (previous >= 0 && arr[previous] > temp) {
				arr[previous + 1] = arr[previous];
				previous--;
			}
			arr[previous + 1] = temp;
			{
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}