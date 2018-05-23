package com.serachingAlgo;

import java.util.HashSet;
import java.util.Set;

public class TwoElemetsWithSumK {

	public static void main(String[] args) {
		int sum=8;

		int[] intArray= {1,3,7,5,4,7,5,2,6,10,54};
		
		
	Set<Integer> intSet= new HashSet<>();
	
	for (int i = 0; i < intArray.length; i++) {
		
		int diff=sum-intArray[i];
		if (intSet.contains(diff)) {
			
			System.out.println("The pair is "+ intArray[i] +"   "+diff);
		}
		else {
			intSet.add(intArray[i]);
		}
		
	}
	
	}
}
