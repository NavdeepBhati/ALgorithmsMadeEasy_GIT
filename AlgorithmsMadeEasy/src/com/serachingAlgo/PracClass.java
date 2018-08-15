package com.serachingAlgo;

import java.util.HashSet;
import java.util.Set;

public class PracClass {

	public static void main(String[] args) {
		int intArray[] = { 5, 4, 3, 2, 1 };

		// findSecondLargestNo(intArray);

		// findSumPair();
		// findSumThreeNos();

		findTripletSumZero();
		findSumZero();
	}

	private static void findSumZero() {

		int givenArray[] = { -25, -10, -7, -3, 2, 4, 8, 10, 0, -4};
		for (int i = 0; i < givenArray.length; i++) {
			for (int j = i + 1; j < givenArray.length; j++) {
				for (int k = j + 1; k < givenArray.length; k++) {
					if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
						System.out.println(
								"Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
					}
				}
			}
		}
	}

	private static void findTripletSumZero() {
		// int[] intArray= {-1,0,1,2,-1,-4};
		int[] intArray = { -25, -10, -7, -3, 2, 4, 8, 10, 0, -4 };
		// int[] intArray= {125, 124, -100, -25, 1, 2, -3, 10, 100};

		for (int i = 0; i < intArray.length; i++) {

			int sum = (intArray[i]);

			Set<Integer> intSet = new HashSet<>();

			for (int j = i; j < intArray.length; j++) {

				int diff = intArray[j] - sum;
				int diff2 = -sum - intArray[j];

				if (intSet.contains(diff) && intArray[j] + diff + intArray[i] == 0) {

					System.out.println("The pair is " + intArray[j] + "   " + diff + "   " + intArray[i]);
				} else if (intSet.contains(diff2) && intArray[j] + diff2 + intArray[i] == 0) {

					System.out.println("The pair is " + intArray[j] + "   " + diff2 + "   " + intArray[i]);

				}

				else {
					intSet.add(intArray[j]);
				}

			}
		}

	}

	private static void findSumThreeNos() {
		int sum = 24;
		int[] intArray = { 12, 3, 4, 1, 6, 9, 10, 2, 8 };

		for (int i = 0; i < intArray.length; i++) {

			int sumComp = sum - intArray[i];

			Set<Integer> setInt2 = new HashSet<>();

			for (int j = i; j < intArray.length; j++) {

				int sumComp2 = sumComp - intArray[j];

				if (setInt2.contains(sumComp2)) {

					System.out.println("Pair   " + "{" + intArray[i] + "," + sumComp2 + "," + intArray[j] + "}   ");
				} else
					setInt2.add(intArray[j]);

			}

		}

	}

	private static void findSumPair() {
		int sum = 8;

		int[] intArray = { 1, 3, 7, 5, 4, 7, 5, 2, 6, 10, 54 };

		Set<Integer> setInt = new HashSet<>();

		for (int i = 0; i < intArray.length; i++) {

			setInt.add(intArray[i]);

			int sumComp = sum - intArray[i];

			if (setInt.contains(sumComp)) {

				System.out.println("Pair   " + "{" + intArray[i] + "," + sumComp + "}   ");
			}

		}

	}

	private static void findSecondLargestNo(int[] intArray) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < intArray.length; i++) {

			if (largest < intArray[i]) {

				secondLargest = largest;
				largest = intArray[i];
			}

			if (secondLargest < intArray[i] && largest != intArray[i]) {
				secondLargest = intArray[i];
			}

		}

		System.out.println("largest    " + largest + "  secondLargest  " + secondLargest);
	}
}
