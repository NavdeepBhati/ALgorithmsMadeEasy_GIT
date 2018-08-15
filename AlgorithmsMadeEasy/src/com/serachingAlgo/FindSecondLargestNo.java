package com.serachingAlgo;

public class FindSecondLargestNo {

	public static void main(String[] args) {
		Integer intArray[] ={5,4,3,2,1};

		int largest =Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
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
