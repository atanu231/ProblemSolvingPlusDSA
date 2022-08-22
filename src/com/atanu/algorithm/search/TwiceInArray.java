package com.atanu.algorithm.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwiceInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,  4, 5 };
//		boolean twiceInArr = twiceInArr(arr);
//		boolean twiceInArr = twiceInArrBySet(arr);
		boolean twiceInArr = twiceInArrByloops(arr);
		System.out.println(twiceInArr);

	}

	private static boolean twiceInArr(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				return true;
			}

		}
		return false;
	}

	private static boolean twiceInArrBySet(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				return true;
			}

		}
		return false;
	}

	private static boolean twiceInArrByloops(int[] arr) {
		if (!(1 <= arr.length && arr.length <= Math.pow(10, 5)))
			return false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -Math.pow(10, 9) && arr[i] <= Math.pow(10, 9)) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == arr[i]) {
						return true;
					}
				}
			} else
				return false;

		}
		return false;
	}

}
