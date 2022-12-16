package week2.day1assginments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindAccount {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
		String expectedOutput = driver.findElement(By.xpath("//span[text()='Credit Limited Account  (accountlimit100)']")).getText();
		if(expectedOutput.contains("Credit Limited Account"))
		{	
			System.out.println("The text of the Account Name matches with expected output.");
		 
		}
		else{
		
			System.out.println("The text of the Account Name does not match.");
		}
		String description = driver.findElement(By.xpath("//td[text()='Sales account with a credit limit of $100 USD']")).getText();
		System.out.println("The Account Description is " + description);
		String pageTitle = driver.getTitle();
		System.out.println("The Page Title is " + pageTitle);
		if(pageTitle.equals("Account Details | opentaps CRM"))
				{
		System.out.println("The Page Title matches with the expected output.");
		}
		else
		{
			System.out.println("The Page Title does not match.");
		}	
		driver.close();

	}
	

}
