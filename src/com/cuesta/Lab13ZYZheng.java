/**
 * Lab 13
 * CIS 231 / Cuesta College
 * Spring 2018 / R. Scovil
 * Zhongyuan Zheng / zhongyuan_zheng@my.cuesta.edu
 */

package com.cuesta;

public class Lab13ZYZheng {
	// Can change this constant to a different amount
	private static final int NUM_VALUES = 15;
	private static final String MY_NAME = "Zhongyuan Zheng";

	public static void main(String[] args) {
		System.out.println("My name is " + MY_NAME + ".");

		int[] data = randomArray(NUM_VALUES);

		// You can change the # of items per line
		printArray(data, 4);

		System.out.println("Largest value is: " + findLargest(data));
	}

	public static int[] randomArray(int amount) {
		int [] randomInts = new int[amount];
		for (int i = 0; i < amount; i ++) {
			randomInts[i] = (int) (Math.random() * 100);
		}
		return randomInts;
	}

	public static void printArray(int[] array, int numPerLine) {
		int len = array.length;
		for (int i = 0; i < len; i ++) {
			System.out.print(array[i] + " ");
			if ((i+1) % numPerLine == 0 || i == len - 1) {
				System.out.println();
			}
		}
	}

	public static int findLargest(int[] array) {
		int len = array.length;
		if (len == 0) {
			return 0;
		}
		
		int largest = array[0];
		for (int i = 1; i < len; i ++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		
		return largest;
	}

}