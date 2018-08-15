package com.strinAlgo;

import java.util.Arrays;

public class RotationalPalindrome {

	public static void main(String[] args) {

		checkPalindrome();

	}

	private static void checkPalindrome() {

		String str = "abcde";

		char[] strArray = str.toCharArray();

		 int n = str.length();
	        for (int i = 0; i < n-1; i++)
	        {
	            String str1 = str.substring(i+1);
	            String str2 = str.substring(0, i+1);
	 
	            // Check if this rotation is palindrome
	            
	            System.out.println(str1+"    "+str2);
	            
	            
	            if (check(str1+str2)) {
					
	            	System.out.println("is palindreom   "+str1+str2);
	            	break;
				}
	        }
	}

	private static boolean check(String str) {

		char[] ch = str.toCharArray();
		
		int j = ch.length;

		boolean b = true;
		for (int i = 0; i < ch.length / 2; i++) {

			// System.out.println(ch[i]+" "+ch[j-1]);
			if (ch[i] == ch[j - 1]) {
				j--;
			} else {
				b = false;
				break;
			}
		
		}

		return b;
	}
}
