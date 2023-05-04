package week4day1assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 1,2,3,5,5,6,7,7,7
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order--TreeSet
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int nums[]= {1,2,3,5,5,6,7,7,7,8,9,10};
		Set <Integer> missnums=new TreeSet<Integer>();
		for(int i:nums) {
		missnums.add(i);
	}
        System.out.println(missnums);
        //List <Integer> list=new ArrayList<Integer>(missnums);
        List<Integer>list=new ArrayList<Integer>(missnums);
        for(int j=0;j<list.size();j++) {
        	if(list.size()>list.get(j+1)) {
        	if(list.get(j+1)-list.get(j)>1) {
        		int missingnum=list.get(j)+1;
        		System.out.println("Missing no is:"+missingnum);
        		break;
        	}
        	}
        /*Iterator <Integer> iterator = missnums.iterator();
        int num1,num2=0;
        while(iterator.hasNext()) {
        	num1=iterator.next();
        if(iterator.hasNext()) {
        	num2=iterator.next();
        }*/
        
        }
        
	}

}
