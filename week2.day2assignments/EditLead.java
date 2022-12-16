package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		WebElement editPage = driver.findElement(By.xpath("//div[text()='View Lead']"));
		String verifyPageTitle = editPage.getText();
		if(verifyPageTitle.equals("View Lead")) 
		{
			System.out.println("The page title 'View Lead' is displayed");
		}
		else
		{
			System.out.println("Wrong Page Title");	
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Qeagle Pvt Ltd");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		WebElement companyElement = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String companyName = companyElement.getText();

		if(companyName.contains("Qeagle Pvt Ltd"))
		{
			System.out.println("The Company Name is updated as" + companyName);			
		}
		else
		{
			System.out.println("The Company Name is NOT updated.");
		}
		driver.close();
		
	}

}
