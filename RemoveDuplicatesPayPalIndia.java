package week4day1assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesPayPalIndia {

	

			public static void main(String[] args) {		
				
//				Declare a String as "PayPal India"

//				Convert it into a character array

//				Declare a Set as charSet for Character

//				Declare a Set as dupCharSet for duplicate Character

//				Iterate character array and add it into charSet

//				if the character is already in the charSet then, add it to the dupCharSet

//				Check the dupCharSet elements and remove those in the charSet

//				Iterate using charSet

//				Check the iterator variable isn't equals to an empty space

//				print it
				String input="PayPal India";
				char[] charArray=input.toCharArray();
				Set<Character> charSet=new HashSet<Character>();
				Set<Character> dupcharSet=new HashSet<Character>();
				//Iterate character array and add it into charSet
				for(int i=0;i<charArray.length;i++) {
					charSet.add(charArray[i]);
					//if the character is already in the charSet then, add it to the dupCharSet
					if(charSet.contains(charArray[i])) {
						dupcharSet.add(charArray[i]);
					}
				}
				System.out.println(charSet);
				/*
				for(int i=0;i<charArray.length;i++) {
					//if the character is already in the charSet then, add it to the dupCharSet
				
					if(charSet.contains(charArray[i])) {
						dupcharSet.add(charArray[i]);
					}
						
				}*/
				System.out.println(dupcharSet);
				//Check the dupCharSet elements and remove those in the charSet
				//for (Character char1 : dupcharSet) {
				List<Character> duplicatecharlist=new ArrayList<Character>(dupcharSet);
				for(int i=0;i<duplicatecharlist.size();i++) {
					if(charSet.contains(duplicatecharlist.get(i))) {
						charSet.remove(duplicatecharlist.get(i));
					}
					
				}
				//for(int i=0;i<charSet.size();i++) {
					//Check the iterator variable isn't equals to an empty space
				System.out.println(charSet.size());
					if(charSet.size()>0) {
						System.out.println(charSet);
					}
					
				}
		
			}

		

		

