package week4day1assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	private static final String Arrayssplit = null;

	
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		public static void main(String[] args) {
		String text = "We learn java basics as part of java sessionsin java week1";
		//Split the String based on white spaces and save as String Array ,Then iterate the Array
		String strArray[]=text.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
			}
		//Create a empty Set 
		Set <String>set1=new HashSet<String>();
		for(int i=0;i<strArray.length;i++) {
			set1.add(strArray[i]);
		}
		System.out.println(set1);
			
		}
			
		}
		
			
		
		
		
		
		
	
		
	


