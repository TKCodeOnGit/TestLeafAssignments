package week3.day2assigments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacte {

	public static void main(String[] args) {
		 
		String name = "Kavitha";
		char[] charArray = name.toCharArray();
		String output = "";
		
		Set<Character> charSet = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charSet.add(charArray[i]))
			{
				output =  output+charArray[i];
			}			
		}
		System.out.println("The unique character in the name is " + output);
	}

}
