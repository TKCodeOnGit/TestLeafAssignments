package week3.day2assigments;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		
		String  input = "abbaba";
		char[] inputArray = input.toCharArray();
		
		Map<Character, Integer> inputMap = new HashMap<Character, Integer>();
		Map.Entry<Character, Integer> maxValue = null;
		
		for (int i = 0; i < inputArray.length; i++) {		
			
			if(inputMap.containsKey(inputArray[i]))
			{
				int existingValue = inputMap.get(inputArray[i]);
				inputMap.put(inputArray[i], existingValue+1);	
				
			}
			else
			{
				inputMap.put(inputArray[i], 1);
			}			
			
		}
		
		System.out.println(inputMap);
		
		System.out.println("maximum value is : "+ Collections.max(inputMap.keySet()));
		
//		for (Map.Entry<Character, Integer> entry : inputMap.entrySet()) {			
//		    System.out.println(entry.getKey() + "/" + entry.getValue());
//		}
//		
		 
		
		
		}
		
		
	}


