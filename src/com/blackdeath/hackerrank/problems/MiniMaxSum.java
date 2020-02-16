/**
 * 
 */
package com.blackdeath.hackerrank.problems;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 * 
 * For example, . Our minimum sum is and our maximum sum is . We would print 16
 * 24
 * 
 * 64 bits example: 256741038 623958417 467905213 714532089 938071625
 * 
 * @author blackdeath
 *
 */
public class MiniMaxSum {

	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);

		BigDecimal suma = new BigDecimal("0");

		for (int i = 0; i < arr.length; i++) {
			suma = suma.add(new BigDecimal(arr[i]));
		}

		System.out.println(
				suma.subtract(new BigDecimal(arr[arr.length - 1])) + " " + suma.subtract(new BigDecimal(arr[0])));
	}

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(args[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);
	}
}
