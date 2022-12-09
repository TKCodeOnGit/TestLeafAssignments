package week1.day1assignmts;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		boolean bPrime = true;
		
		for (int i = 2; i < n; i++)
		{
			
			if (n % i == 0)
			{
				System.out.println("not a prime");
				bPrime = false;
				break;									
			}
		}
		
		if(bPrime)
		{
			System.out.println("It is a Prime.");
			
		}
		
		
		

	}

}
