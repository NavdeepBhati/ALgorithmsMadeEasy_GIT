package com.serachingAlgo;

import java.util.Arrays;

public class MzxDuplicates {

	public static void main(String[] args) {
		
		int intArray[]= {1,2,3,4,4,4,6,6,7,7,7,8,9,10,323,4,1,2,};
		
		checkUsingArray(intArray);
		checkAfterSorting(intArray);
		
	}

	private static void checkAfterSorting(int[] intArray) {
		insertionSort(intArray);
		int maxcount=0,value=0;
		for (int i = 0; i < intArray.length; i++) {
			int counter = 0;

			for (int j = i; j < intArray.length ; j++) {
				
				if (intArray[i]!=intArray[j]) {
					break;
				}else
					counter++;
			}
			
			if (counter > maxcount) {
				maxcount = counter;
				value = intArray[i];
			}
		}
		
		System.out.println("value   "+ value +  "   maxCount   "+  maxcount);

		
	}


	 public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	        }
			System.out.println(Arrays.toString(array));

	    }
	private static void checkUsingArray(int[] intArray) { // Complexity O(n^2)

		int max = 0, value = 0;
		for (int i = 0; i < intArray.length; i++) {
			int counter = 0;
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					counter++;
				}
			}
			//System.out.println(intArray[i] + "   =  " + counter);
			if (counter > max) {
				max = counter;
				value = intArray[i];
			}
		}
		System.out.println("value   "+ value +  "   max   "+  max);
	}
}
