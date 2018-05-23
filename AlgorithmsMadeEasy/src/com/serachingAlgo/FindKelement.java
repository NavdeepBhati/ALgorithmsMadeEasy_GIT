package com.serachingAlgo;

public class FindKelement {

	public static void main(String[] args) {
		
		int intArray[]= {1,4,5,6,7,8,9,11,14,16,18,19,20,23,24,25,27,29,30,31,35,57,66,79,89,94,97};
		int num=66;
		checkElement(intArray,num);
		
		
	}

	private static void checkElement(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			
			int mid = (start + end) / 2;
			System.out.println("start  "+ start +"   end   "+ end +"  mid  "+mid);
			if (key == inputArr[mid]) {
				System.out.println(mid);
			}
			
			if (key < inputArr[mid]) {
				end = mid - 1;
			
			} else {
				start = mid + 1;
			}
		}
	}

}
