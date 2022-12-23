package week3.day2assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		//created a new Set
		Set<Integer> numSet = new TreeSet<Integer>();

		//iterate over the array to add the value to Set
		for (int i = 0; i < data.length; i++) {

			numSet.add(data[i]);			
		}

		
		//		Create a list and add the set values to the list.

		List<Integer> numList = new ArrayList<Integer>();
		numList.addAll(numSet);

		//		to sort the list in descending order
		Collections.sort(numList, Collections.reverseOrder());

		System.out.println("The second highest number is" + numList.get(1));


	}

}
