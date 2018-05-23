package com.serachingAlgo;

public class TwoIntegerSumClosestToZero {

	public static void main(String[] args) {
		int[] A = { 1, 60, -10, 70, -80, 85 };

		
		int min_sum=A[0]+A[1];
		int b = 0,c = 1;
		for (int i = 0; i < A.length; i++) {

			for (int j = i+1; j < A.length; j++) {


				if (Math.abs(min_sum) > Math.abs(A[i] + A[j])) {
					min_sum = (A[i] + A[j]);

					b = A[i];
					c = A[j];
				}
			}
		}
		System.out.println("b   "+b+"   c    "+c+"    minSUm    "+min_sum);

	}
}
