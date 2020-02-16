/**
 * 
 */
package com.blackdeath.hackerrank.problems;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author blackdeath
 *
 */
public class MiniMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);

		BigDecimal maximo = new BigDecimal("0");
		BigDecimal minimo = new BigDecimal("0");

		for (int i = 0; i < arr.length - 1; i++) {
			minimo = minimo.add(new BigDecimal(arr[i]));
			System.out.println(i + " " + arr[i]);
		}
		
		System.out.println("");

		for (int i = arr.length - 1; i > 0; i--) {
			maximo = maximo.add(new BigDecimal(arr[i]));
			System.out.println(i + " " + arr[i]);
		}

		System.out.println("");
		System.out.println(minimo + " " + maximo);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

//		String[] arrItems = scanner.nextLine().split(" ");
//		SCANNER.SKIP("(\R\N|[\N\R\U2028\U2029\U0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(args[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
