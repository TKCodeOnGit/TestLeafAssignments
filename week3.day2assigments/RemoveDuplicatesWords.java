package week3.day2assigments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		String output = "";
		
		Set<String> stringSet = new LinkedHashSet<String>();
		
		for (int i = 0; i < textArray.length; i++) {
			if(stringSet.add(textArray[i])) {
						output = output + " " + textArray[i];
			}			
		}		
		System.out.println(output);
	}

}
