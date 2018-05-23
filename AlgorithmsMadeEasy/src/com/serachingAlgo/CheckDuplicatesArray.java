package com.serachingAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckDuplicatesArray {

	
	
	public static void main(String[] args) {
		
		int intArray[]= {1,2,3,4,4,4,6,6,7,7,7,8,9,10,323,4,1,2,4};		
		
		checkUsingArray(intArray);
		
		checkingAfterSorting(intArray);
		
		checkUsingHashMAp(intArray);
		
		//checkNegating(intArray);
	}


/*	
	private static void checkNegating(int[] intArray) {
			for (int i = 0; i < intArray.length; i++) {
				
				if (intArray[Math.abs(intArray[i])]<0) {
					
					System.out.println("duplictaes  "+intArray[i]  );
					
				}
				else
					intArray[intArray[i]]=-intArray[intArray[i]];
			}
		
		
	}

*/

	private static void checkUsingHashMAp(int[] intArray) {

		Map<Integer, Integer> intHashMap= new HashMap<>();
		
		for (int i = 0; i < intArray.length; i++) {
				
				intHashMap.put(intArray[i], intHashMap.containsKey(intArray[i]) ? intHashMap.get(intArray[i]) + 1 : 1);
		}
		System.out.println("intHashMap   "+intHashMap );
	    int maxValue =Collections.max(intHashMap.values());
	    System.out.println("maxValue  "+maxValue);
		
	    
	    int keyOfMaxValue = Collections.max(
	    		intHashMap.entrySet(), 
                new Comparator<Entry<Integer,Integer>>(){
                    @Override
                    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                        return o1.getValue() > o2.getValue()? 1:-1;
                    }
                }).getKey();
	
	System.out.println("keyOfMaxValue    " + keyOfMaxValue);
	
	}


	private static void checkingAfterSorting(int[] intArray) {

		insertionSort(intArray);

		for (int i = 0; i < intArray.length-1; i++) {
			 
			if (intArray[i]==intArray[i+1]) {
				System.out.println("Duplicate exist   "+ intArray[i]);
			}
		}
	}


	private static void insertionSort(int[] intArray) {

		int temp;
		for (int i = 0; i < intArray.length-1; i++) {
			for (int j = i; j > 0 && intArray[j]>intArray[i]; j--) {
				if (intArray[j] < intArray[j - 1]) {

					temp = intArray[j];
					intArray[j] = intArray[j - 1];
					intArray[j - 1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(intArray));
		
	}


	private static void checkUsingArray(int[] intArray) { // Complexity O(n^2)
		
		for (int i = 0; i < intArray.length; i++) {
			int counter=0;
			for (int j = 0; j < intArray.length; j++) {
				if (intArray[i]==intArray[j]) {
					counter++;
				}
			}
			System.out.println(intArray[i]+"   =  "+counter);
			
		}
	}
}
