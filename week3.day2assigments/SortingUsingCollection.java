package week3.day2assigments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {	 
		
		String[] companies = {"HCL", "Wipro",  "Aspire Systems", "CTS"};		
		int stringLength =companies.length;		
//		Method 1
		Arrays.sort(companies);		
		Set<String> reverseSet = new LinkedHashSet<String>();
	
		for (int i = stringLength-1; i >= 0; i--) 
		{			
			reverseSet.add(companies[i]);			
		}
		
		System.out.println(reverseSet);		
		
		
//		Method 2
		Arrays.sort(companies);
		
		for (int i = stringLength-1; i >= 0; i--) 
		{			
			System.out.println(companies[i]);			
		}

		
	}
}
