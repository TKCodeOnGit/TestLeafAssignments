package week1.day1assignmts;

public class Fibonocci {
	public static void main(String[] args) {
		
		int sum, firstNumber = 0;
		int secondNumber = 1;
		System.out.println("Fibonocci Series:");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for(int counter = 1; counter <= 11; counter++)
		{
			sum = firstNumber + secondNumber;
			System.out.println(sum);			
			firstNumber = secondNumber;		
			secondNumber = sum;			
		}
		
		
	}

}
