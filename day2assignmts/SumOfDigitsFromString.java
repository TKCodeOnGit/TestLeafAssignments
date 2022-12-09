package week1.day2assignmts;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum = 0;
		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i]))
			{				
				int value =  Character.getNumericValue(charArray[i]);
				sum = sum + value;
			}			

		}
		System.out.println("The total value of the digits is " + sum);

	}
}
