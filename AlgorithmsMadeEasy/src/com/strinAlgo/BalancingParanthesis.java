package com.strinAlgo;

import java.util.Stack;


public class BalancingParanthesis {

	public static void main(String[] args) {
		
	//	String str= "a(b((c)de)t";
		//String str= "a))a((a";
	//	String str= "((}}";
		String str= "(((";

		char[] charArray= str.toCharArray();
		Stack<Character> stack = new Stack<>();
			
		boolean b=	checkBakance(charArray, stack);

		
		if (b) {
			System.out.println("balanced");
		}else
			System.out.println("not balanced");

	}

	private static boolean checkBakance(char[] charArray, Stack<Character> stack) {
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]=='('  ) {
				stack.push('(');
			}
			/*else if(charArray[i]=='{'  ) {
				stack.push('}');
			}*/
		
			else if (charArray[i]==')' ||  charArray[i]=='}') {
			
					//list.remove(')');	
				if (!stack.isEmpty()) {
					stack.pop();
				}
				else
				{
						return false;
				}
					
			}
			
		}
		
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
