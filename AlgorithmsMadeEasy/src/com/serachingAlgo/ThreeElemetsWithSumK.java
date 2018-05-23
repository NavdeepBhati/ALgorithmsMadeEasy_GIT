package com.serachingAlgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeElemetsWithSumK {

	
	public static void main(String[] args) {
		int sum=24;
		int[] intArray= {12, 3, 4, 1, 6, 9,10,2,8};
		
		find3numbersUsingSet(sum, intArray);
		find(intArray);//Sum is 0 array should consist of negeative nos.	

	}
	
		
	public static void find(int [] x){
        for (int i = 0; i <x.length ; i++) {
            int a = x[i];
            HashSet<Integer> set = new HashSet<Integer>();

            for (int j=i+1; j<x.length; j++) {
                int b = x[j];
                int c = -(a+b);
                if(set.contains(c)){
                    System.out.println("Found 3 elements whose sum is = 0");
                    System.out.println("Elements are " + a + " " + b + " " + c);
                    return;
                }else
                    set.add(b);
            }
        }
    }
	
	private static void find3numbersUsingSet(int sum, int[] intArray) {

		System.out.println(Arrays.toString(intArray));
		for (int i = 0; i < intArray.length; i++) {
			
			int dif1= sum-intArray[i];
			Set<Integer> intSet= new HashSet<>();

			for (int j = i; j < intArray.length; j++) {
				 
				int diff=dif1-intArray[j];
				if (intSet.contains(diff)) {
					
					System.out.println("The pair is "+ intArray[j] +"   "+diff +"   "+intArray[i]);
				}
				else {
					intSet.add(intArray[j]);
				}
				
			}
			
		}
	}
}
