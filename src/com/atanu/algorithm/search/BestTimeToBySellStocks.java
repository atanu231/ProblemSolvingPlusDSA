package com.atanu.algorithm.search;

public class BestTimeToBySellStocks {

	public static void main(String[] args) {
		int[] stocksPerDay = { 7, 1, 5, 3, 6, 4 };
		int length = stocksPerDay.length;
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;

		for (int i = 0; i < length; i++) {
			if (stocksPerDay[i] < buyPrice) {
				buyPrice = stocksPerDay[i];

			} else {
				int profit = stocksPerDay[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			}

		}
		System.out.println(maxProfit);
	}

}
