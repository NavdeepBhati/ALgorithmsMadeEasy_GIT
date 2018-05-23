package com.serachingAlgo;

public class NumberOccuringOddTimes {

	
	
	
	 static int getOddOccurrence(int ar[], int ar_size) 
	    {
	        int i;
	        int res = 0;
	        for (i = 0; i < ar_size; i++) 
	        {
	            res = res ^ ar[i];
	        }
	        return res;
	    }
	 
	    public static void main(String[] args) 
	    {
	        int ar[] = {1,2,3,2,3,1,3,5,5};
	        int n = ar.length;
	        System.out.println(getOddOccurrence(ar, n));
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static void main(String[] args) {
		
		int[] intArray={1,2,3,2,3,1,3,5};

		int X = 0;
		
		for (int i = 0; i < intArray.length; i++) {
		
			X = X^intArray[i];
		System.out.println("intArray   "+ intArray[i] +"  X   "+ X);
		}

		System.out.println(X);
	}
*/}
