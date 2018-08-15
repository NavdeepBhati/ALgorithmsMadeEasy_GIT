package com.strinAlgo;


import java.util.ArrayList;
import java.util.List;

public class StringPermutationsEx {

   public static void main(String a[]) {

       List<String> output = StringPermutationsEx.generatePermutations("xyz");
       System.out.println("Result size: "+output.size());
       for (String string : output) {
		System.out.println(string);
	}
       
       System.out.println("------------------");

       output = StringPermutationsEx.generatePermutations("ABCD");
       
       for (String string : output) {
   		System.out.println(string);
   	}
       
       System.out.println("Result size: "+output.size());
   }

   public static List<String> generatePermutations(String input) {

       List<String> strList = new ArrayList<String>();
       StringPermutationsEx.permutations("", input, strList);

       return strList;
   }

   private static void permutations(String consChars, String input, List<String> opContainer) {

       if(input.isEmpty()) {
           opContainer.add(consChars+input);
           return;
       }
     
       for(int i=0; i<input.length(); i++) {
    	   
    	   System.out.println(" consChars: "+consChars+"   input.charAt: "+input.charAt(i) +" substring: "+ input.substring(0, i)+input.substring(i+1));
    	   System.out.println();
           permutations(consChars+input.charAt(i),
                           input.substring(0, i)+input.substring(i+1),
                           opContainer);
       }
   }
}