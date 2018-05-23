package com.strinAlgo;

import java.util.LinkedList;
import java.util.List;

//Java program to print all permutations of a
//given string.
public class Permutation
{
	
	static int counter;
	static List<String> list = new LinkedList<>();
 public static void main(String[] args)
 {
     String str = "ABCD";
     int n = str.length();
     Permutation permutation = new Permutation();
     permutation.permute(str, 0, n-1);
     
     System.out.println(list.size());
     System.out.println(list);
     System.out.println(counter);
 }

 /**
  * permutation function
  * @param str string to calculate permutation for
  * @param l starting index
  * @param r end index
  */
 private void permute(String str, int l, int r)
 {
	 
	 
     if (l == r) {
        list.add(str);
    	 System.out.println(str +"     " +  r  +"     " +l);
     }else
     {
         for (int i = l; i <= r; i++)
         {
             str = swap(str,l,i);
             System.out.println("str "+ str +"   l  "+ l + "   i  "+i);
             permute(str, l+1, r);
             str = swap(str,l,i);
             System.out.println("str "+ str +"   l  "+ l + "   i  "+i);
         }
     }
 }

 /**
  * Swap Characters at position
  * @param a string value
  * @param i position 1
  * @param j position 2
  * @return swapped string
  */
 public String swap(String a, int i, int j)
 {
	 counter++;
     char temp;
     char[] charArray = a.toCharArray();
     temp = charArray[i] ;
     charArray[i] = charArray[j];
     charArray[j] = temp;
     return String.valueOf(charArray);
 }

}

//This code is contributed by Mihir Joshi