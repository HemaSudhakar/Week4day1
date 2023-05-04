package week4day1assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Problem
		* a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * Input:  babu
		 * Output: a u 
		 * Psuedocode
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String input="Heema";
		char[] charArray=input.toCharArray();
		
		Set <Character> uniquechar=new HashSet<Character>();
		
		
			//Add each character to the Set and if it is already there, remove it
		for(int i=0;i<charArray.length;i++) {
			if(uniquechar.contains(charArray[i])) {
				uniquechar.remove(charArray[i]);
			}else
			{
				uniquechar.add(charArray[i]);
			}
			
			
			/*for (int j=0;j<=charArray.length+1;j++) {
				if (charArray[i]!=charArray[j]) {
					
					System.out.println(uniquechar);
					
				}
			}*/
			
			}
		System.out.println(uniquechar);
		}
 
	}


