package week3.day1assignments;

public class AxisBank extends BankInfo {
	
	public static void main(String[] args) {
		
		AxisBank myBank = new AxisBank();
		myBank.deposit(2, 50000);
		myBank.saving();
		myBank.fixed(5000);	
		
	}
	
//	Example of Overriding methods
	
	public void deposit(int tenure, int amount)
	{
		System.out.println("The deposit tenure is " + tenure + ". The deposited amount is " + amount);
	}

}
