package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();		

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("k");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
		String leadName = leadID.getText();
		System.out.println("The first Lead Name is " + leadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		Thread.sleep(3000);
		WebElement duplicatePage = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
		String verifyPageTitle = duplicatePage.getText();
		if(verifyPageTitle.equals("Duplicate Lead")) 
		{
			System.out.println("The page title 'Duplicate Lead' is displayed");
		}
		else
		{
			System.out.println("Wrong Page Title");	
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(2000);
		WebElement duplicatedLead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String duplicateLeadName = duplicatedLead.getText();

		if(duplicateLeadName.equals(leadName))
		{
			System.out.println("The duplicated Lead Name is same as the captured Lead Name.");			
		}
		else
		{
			System.out.println("The duplicated lead is NOT same as the captured Name.");
		}
		driver.close();

	}

}
