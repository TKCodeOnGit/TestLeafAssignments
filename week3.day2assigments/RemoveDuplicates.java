package week3.day2assigments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		
		String text =  "PayPal India";
		char[] textArray = text.toCharArray();
		Set<Character> charSet = new TreeSet<Character>();
		Set<Character> dupCharSet = new TreeSet<Character>();
		String output = "";
		for (int i = 0; i < textArray.length; i++) {
			if(charSet.add(textArray[i]))
			{
				output = output+textArray[i];
				
			}
			else
			{
				dupCharSet.add(textArray[i]);
			}			
		}
		

		System.out.println(output.replace(" ", ""));
	}

}
