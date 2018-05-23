package com.strinAlgo;

public class ChcekPAlindrome {

	public static void main(String[] args) {
		String str="maamddzzzzz";
		
		char[] charArray= str.toCharArray();
		
		char XOR = 0;
		for (int i = 0; i < charArray.length; i++) {
			
			XOR=(char) (XOR^charArray[i]);
			
		}
		
		
		if (XOR==0) {
			System.out.println("Is palindrome");
		}else
			System.out.println("Not palindrome");
		
		System.out.println(XOR);
		
	}
}
