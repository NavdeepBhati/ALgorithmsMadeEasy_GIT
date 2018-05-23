package com.serachingAlgo;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElemet {

	public static void main(String[] args) {
		
	int[]	intArray= {1,6,3,5,8,9,56,3,1,1,4,45,545,4};
	Set<Integer> intSet = new HashSet<>();
	int value=0;
	for (int i = 0; i < intArray.length; i++) {

		
		if(!intSet.add(intArray[i])) {
		
			System.out.println("First Duplicate Items    "+ intArray[i]);
		
		}
	
	}
	}
}
