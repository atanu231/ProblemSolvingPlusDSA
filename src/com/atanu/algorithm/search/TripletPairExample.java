package com.atanu.algorithm.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletPairExample {
	/*
	 * Given an integer array nums, return all the triplets [nums[i], nums[j],
	 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
	 * nums[k] == 0
	 */
	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		Set<List<Integer>> resultSet = new HashSet<>();

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if ((arr[i] + arr[j] + arr[k] == 0)) {
						List<Integer> list = new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						Collections.sort(list);
						resultSet.add(list);
					}
				}
			}
		}
		
		resultSet.forEach(ele->{
			System.out.println(ele);
		});
	}

}
