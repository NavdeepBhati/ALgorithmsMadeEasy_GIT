package com.strinAlgo;

public class CountAllCharString {

	public static void main(String[] args) {

		countChar();

	}

	private static void countChar() {
		String str = "summer";

		char[] charArray = str.toCharArray();
		char[] charArrayTemp = new char[charArray.length];

		int counterTemp = 0;

		// outer:

		for (int i = 0; i < charArray.length; i++) {

			int counter = 0;

			boolean b = false;

			for (int k = 0; k < charArrayTemp.length; k++) {
				if (charArray[i] == charArrayTemp[k] && i < charArray.length) {

					b = true;
					break;
					// continue outer;
				}

			}

			if (b) {

				continue;
			}
			for (int j = i; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {

					counter++;

				}

			}

			System.out.println(charArray[i] + "   " + counter);
			charArrayTemp[counterTemp] = charArray[i];
			counterTemp++;

		}
	}

}
