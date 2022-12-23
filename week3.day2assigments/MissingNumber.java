package week3.day2assigments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		//Number 3 is missing
		int[] data = {1,2,4,5,6,7,8,9,10};

		Set<Integer> dataSet = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			dataSet.add(data[i]);			
		}

		//		System.out.println(dataSet);
		int nextNumber = 1; 

		for (Integer ds : dataSet) {
			if(ds == nextNumber )
			{								
				nextNumber =  nextNumber+1;
			}
			else
			{
				System.out.println("The number missing is " + nextNumber);
				nextNumber =  nextNumber+2;
			}
		}
	}
}
