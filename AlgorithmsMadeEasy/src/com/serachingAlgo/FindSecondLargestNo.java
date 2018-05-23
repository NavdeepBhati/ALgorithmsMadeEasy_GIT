package com.serachingAlgo;

public class FindSecondLargestNo {

	public static void main(String[] args) {
		Integer intArray[] = { 19, 89, 14, 97, 8, 94};

		int largest = intArray[0];
		int secLargest = intArray[0];
		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] > largest) {

				secLargest = largest;
				largest = intArray[i];
			}

			else if (intArray[i] > secLargest && intArray[i] != largest) {
				secLargest = intArray[i];
				
			}	
		}
		System.out.println("largest " + largest + "   seclargest" + secLargest);
	}
}
