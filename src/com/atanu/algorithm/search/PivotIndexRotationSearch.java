package com.atanu.algorithm.search;

public class PivotIndexRotationSearch {
	/*
	 * There is an integer array nums sorted in ascending order (with distinct
	 * values). Prior to being passed to your function, nums is possibly rotated at
	 * an unknown pivot index k (1 <= k < nums.length) such that the resulting array
	 * is [nums[k], nums[k+1], ..., nums[n -1], nums[0], nums[1], ..., nums[k -1]]
	 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
	 * and become [4,5,6,7,0,1,2]. Given the array nums after the possible rotation
	 * and an integer target, return the index of target if it is in nums , o r -1
	 * if it is not in nums. You must write an algorithm with O(log n) runtime
	 * complexity
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 3;
		int pivotIndex = pivotMinIndex(arr);
		int index = -1;
		if (arr[pivotIndex] <= target && target <= arr[arr.length - 1]) {
			index = binarySearchTargetIndex(arr, pivotIndex, arr.length - 1, target);
		} else
			index = binarySearchTargetIndex(arr, 0, pivotIndex, target);
		System.out.println(index);
	}

	private static int pivotMinIndex(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;

			// ascending order array is rotated in pivot index
			// where right element < left element.
			if (mid > 0 && nums[mid - 1] > nums[mid])
				return mid;
			if (nums[mid - 1] <= nums[mid] && nums[mid] > nums[right])
				left = mid + 1;
			else
				right = mid - 1;
		}
		return left;
	}

	private static int binarySearchTargetIndex(int[] arr, int pivotIndex, int end, int target) {
		int start = pivotIndex;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target)
				return mid;
			if (arr[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

}
