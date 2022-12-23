package week3.day2assigments;


import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {
	public static void main(String[] args) {
		
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> inputMap = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < input.length; i++) {
			if(inputMap.containsKey(input[i]))
			{
				int existingCount = inputMap.get(input[i]);
				inputMap.put(input[i], existingCount+1);
			}
			else
			{
				inputMap.put(input[i], 1);
			}
			
			
			
		}
		System.out.println("Character count " + inputMap);
		
	}
	
	
	  

}
