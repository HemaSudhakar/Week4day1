package week4day1assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		String[] strArray= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length=strArray.length;
		List<String> sortArray=new ArrayList<String>();
		sortArray.add("HCL");
		sortArray.add("Wipro");
		sortArray.add("Aspire Systems");
		sortArray.add("CTS");
		Collections.sort(sortArray,Collections.reverseOrder());
		//System.out.println(sortArray);
		
		for (int i =strArray.length; i>=0; i--) {
			
		}
	System.out.println(sortArray);	
		}
	
	
		
		
	


	}


