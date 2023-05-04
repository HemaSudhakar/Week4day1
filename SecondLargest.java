package week4day1assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// Here is the input
				
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
		Set <Integer> set=new TreeSet<Integer>();
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//int array[]= {3,2,11,4,6,7,2,3,3,6,7};
		//Iterator iterator = set.iterator(); iterator.hasNext();
		
		//for (int i:data)enhanced for loop
			for (int j = 0; j < data.length; j++) {
				
			
		
			set.add(data[j]);
		}
		System.out.println(set);	
		List<Integer>list=new ArrayList<Integer>(set);
		System.out.println(list.get(list.size()-2));
			
       //TreeSet<Integer>newset=new TreeSet<Integer>(set);
				
				
	}

}
