package com.learn.binary;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 7, -1, 0, 23, 9 };
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 1;
		}

		for (int i = 1, j = 0; i < arr.length;) {
			while (j < i) {
				if (arr[j] < arr[i]) {
					temp[i] = Math.max(temp[i], temp[j] + 1);
				}
				j++;
			}
			i++;
			j = 0;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			if (max < temp[i]) {
				max = temp[i];
			}
		}
		System.out.println(max);
	}

}
