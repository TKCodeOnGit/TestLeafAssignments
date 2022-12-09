package week1.day2assignmts;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator calculate  = new Calculator();
		System.out.println("addition: " + calculate.doAddition(8754, 4327, 98765));
		System.out.println("subtraction: " + calculate.doSubtraction(45098, 6543));
		System.out.println("multiplication: " + calculate.doMultiplication(987.62, 653.21));
		System.out.println("division: " + calculate.doDivision(5.4f, 3.2f));
		
		
	}

}
