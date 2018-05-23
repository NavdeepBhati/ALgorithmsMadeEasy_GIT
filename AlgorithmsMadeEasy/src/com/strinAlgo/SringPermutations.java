package com.strinAlgo;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SringPermutations {

	
	static String strGlobal ="";
	public static void main(String[] args) {

		String str = "abcdef";
		strGlobal=str;
		char[] charArray = str.toCharArray();
		List<String> list = new LinkedList<>();
		
		int fact = 1;
		for (int i = charArray.length; i >= 1; i--) {

			fact = fact * i;

			permute(charArray, fact, list);
		}
		Set<String> set= new LinkedHashSet<>(list);

		System.out.println(list.size() );
		System.out.println(list);
		System.out.println(set.size());
		System.out.println(set);

	}

	private static void permute(char[] charArray, int fact, List list) {

		String str= String.valueOf(charArray);
		int j=charArray.length-1;		
		String str2 = null;
		while (fact > 0) {
			
			if (j<0) {
				break;
			}
			for (int i = 0; i < charArray.length ; i++) {
				
				System.out.println(i+"   "+j);
				str2=	swap(strGlobal, list, i,j);
				list.add(String.valueOf(str2));				
				if (i==0) {

					strGlobal=str2;

				}
				
				
			}
			
			
			j--;
			fact--;
		}
		System.out.println(strGlobal);
	}

	 
	/*for (int i = l; i <= r; i++)
     {
         str = swap(str,l,i);
         permute(str, l+1, r);
         str = swap(str,l,i);
     }
	*/ 
	private static String swap(String str, List list, int i, int j) {
		
		char[] charArray=str.toCharArray();
		
		char temp;
		
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
	//System.out.println(list);
		return String.valueOf(charArray);
	}
}
