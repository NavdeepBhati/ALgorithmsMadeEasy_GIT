package com.strinAlgo;

import java.util.Arrays;

public class RotateArrayPalindrome {
	static int counter = 0;

	public static void main(String[] args) {

		String str = "aaaad";
		char[] chArray = str.toCharArray();
		boolean b = false;
		for (int i = 0; i < chArray.length; i++) {
			rotateString(chArray);
			if (isPalindromeUsingRecursion(chArray, 0, chArray.length - 1)) {
				b = true;
				break;
			}

		}

		if (b) {

			System.out.println("Is palindrome");

		} else
			System.out.println("not plaindrome");

	}

	public static boolean isPalindromeUsingRecursion(char[] ch, int i, int j) {

		if (i == (ch.length / 2)) {

			return true;
		}

		System.out.println(ch[i] + "  " + ch[j]);
		if (ch[i] == ch[j]) {
			j--;
			i++;
			return isPalindromeUsingRecursion(ch, i, j);
		} else {
			return false;
		}
	}

	public static void rotateString(char[] ar) {
		char temp = ar[0];
		int x = 0;
		for (x = 0; x < ar.length - 1; x++) {
			ar[x] = ar[x + 1];
		}
		ar[x] = temp;

		System.out.println(Arrays.toString(ar));
	}

	/*
	 * counter++;
	 * 
	 * if (counter==10) { return; }
	 */
	// rotateString(ar);
}
