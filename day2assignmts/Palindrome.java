package week1.day2assignmts;

public class Palindrome {

	public static void main(String[] args) {

		String value = "madam";

		char[] charArray = value.toCharArray();	

		String reverseString = "";

		for (int i = charArray.length - 1; i >= 0 ; i--) {
			reverseString = reverseString + charArray[i];	
		}		
		System.out.println("reverse string " + reverseString);

		if(value.equals(reverseString))
		{
			System.out.println("The given value is a palindrome");
		}
		else
		{
			System.out.println("The given value is not palindrome");
		}
	}







}
