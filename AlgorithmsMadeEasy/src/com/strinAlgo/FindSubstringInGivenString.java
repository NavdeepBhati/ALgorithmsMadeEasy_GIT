package com.strinAlgo;

public class FindSubstringInGivenString {

	public static void main(String[] args) {

		findSubString();

	}

	private static void findSubString() {

		String str="The fox jumps over the lazy dog";
		char[] strArray= str.toCharArray();
		int len = str.length();
		
		String search ="lazy";
		char[] searchArray= search.toCharArray();
		int lenSearch=search.length();
		
		for (int i = 0; i <len-lenSearch; i++) {
			
			if (strArray[i]==searchArray[0]) {
				int k=i;
				int counter =0; 
				for (int j = 0; j < searchArray.length; j++ , k++) {
					
					if (strArray[k]==searchArray[j]) {
						counter++;
					}else 
						break;
				
				
				}
				
				if (counter==lenSearch) {
					System.out.println("Contains String");

					break;	
				
				}
			}
			
			
		}
		
				System.out.println(str.contains("lazy"));			
		}
		
	}
