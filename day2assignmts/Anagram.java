package week1.day2assignmts;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (charArray1.length == charArray2.length)
		{
			if(Arrays.equals(charArray1, charArray2))
			{
				System.out.println("The given text is an anagram");
			}
			else
			{
				System.out.println("The given text is not an anagram.");
			}
		}
		else
		{
			System.out.println("The length of the two array does not match.");
		}
		
	}

}
