package week3.day1assignments;

public class BankInfo {
	
//	Methods :saving(),fixed(),deposit()
	
	public void saving()
	{
		System.out.println("The savings account should have minimum balance of Rs.5000." );
	}

	
	public void fixed(int amount)
	{
		System.out.println("The minimum amount for fixed deposit is " + amount );
	}
	
	public void deposit(int tenure)
	{
		System.out.println("The minimum deposit tenure is " + tenure);
	}

}
