package com.atanu.algorithm.search;

public class BuystocksAndSellExample {
	/*
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the i th day. Return the maximum profit you can achieve from this
	 * transaction . If you cannot achieve any profit, return 0.
	 */
	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
//		int[] arr = { 7, 6, 4, 3, 1 };
		int maxProfit = busyAndSellStocks(arr);
		System.out.println(maxProfit);
	}

	private static int busyAndSellStocks(int[] arr) {
		int maxProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < buyPrice)
				buyPrice = arr[i];
			else {
				int profit = arr[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}

}
