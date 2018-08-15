package com.serachingAlgo;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 4, 4, 4, 6, 6, 7, 7, 7, 8, 9, 10, 323, 4, 1, 2, 4 };
		insertionSort(intArray);
		removeDup(intArray);
	}

	private static void removeDup(int[] intArray) {

		int intArrayNew[] = new int[intArray.length];
		
		int counter=0;
               		for (int i = 0; i < intArray.length - 1; i++) {

			if (intArray[i] != intArray[i + 1]) {
				intArrayNew[counter]=intArray[i];
				counter++;
				
				
			}

		}
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(intArrayNew));
	}

	private static void insertionSort(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length - 1; i++) {

			int temp;

			if (intArray[i] > intArray[i + 1]) {

				int small = intArray[i + 1];

				for (int j = 0; j <= i + 1; j++) {

					if (small < intArray[j]) {
						temp = intArray[i + 1];
						intArray[i + 1] = intArray[j];
						intArray[j] = temp;

					}
					count++;
				}

			}

		}
		System.out.println("count  " + count + "   " + Arrays.toString(intArray));
	}
}
