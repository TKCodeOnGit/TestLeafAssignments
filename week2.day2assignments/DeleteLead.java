package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();		

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8765412345");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		WebElement leadElement = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String leadText = leadElement.getText();
		System.out.println("The first Lead ID is " + leadText);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadText);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement messageText = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String message = messageText.getText();
		if(message.equals("No records to display"))
		{
			System.out.println("The lead is successfully deleted and No records to display is shown.");
		}
		else
		{
			System.out.println("The lead is not deleted and it is still seen in the grid.");

		}
		driver.close();

	}

}
