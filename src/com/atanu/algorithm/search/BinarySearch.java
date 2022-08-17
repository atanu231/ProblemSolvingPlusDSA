package com.atanu.algorithm.search;

import java.util.Arrays;

/**
 * @author Atanu Baidya
 * 
 * Time Complexity
 * Iteration     Length of the array
 *     1               n   ->  n/2^0
 *     2              n/2  ->  n/2^1
 *     3              n/4  ->  n/2^2
 *     4              n/8  ->  n/2^3
 *     .
 *     .
 *     .
 *     last              1    ->  n/2^k
 *     --------------------------------------
 *     So n/2^k = 1; k = log(n) base 2
 *     Time Complexity will be always : O(log n)
 *     In Worst case, max Iteration will be O(log n) +1
 *
 */
public class BinarySearch {
    
	public static void main(String[] args) {
		// array
		int array[] = { 2, 4, 6, 10, 3, 7, 8, 11 ,12,23,24,18};
		int searchKey = 10;
		boolean isFound = binarySearch(array, searchKey);
		System.out.println(searchKey + " is found in the Array: " + isFound);
	}

	private static boolean binarySearch(int[] array, int searchKey) {
		// Array must be sorted. Arrays.sort is ASC order
		Arrays.sort(array);

		// start Index
		int startIndex = 0;

		// End Index
		int endIndex = array.length - 1;

		// Mid Index
		int midIndex = 0;

		// While Loop to check condition startIndex <= endIndex
		// do Compare midIndex & searchKey.
		// While searching, n will be n, n/2, n/4 ...
		while (startIndex <= endIndex) {
			midIndex = (startIndex + endIndex) / 2;
			
			// Mid element == search Key
			if (array[midIndex] == searchKey)
				return true;

			// Mid element < search Key
			// Search for 2nd Half of the Array:
			// RIGHT side: From mid+1 to end of the Array
			if (array[midIndex] < searchKey)
				startIndex = midIndex + 1;

			// Mid element > search Key : if (array[midIndex] > searchKey)
			// Search for 1st Half of the Array:
			// From LEFT side: from start to mid-1
			else
				endIndex = midIndex - 1;
		}
		return false;
	}

}
