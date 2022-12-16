package week2.day1assginments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XXYY Pvt Limited");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("T");
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 	Select sourceDropDown = new Select(sourceElement);
	 	sourceDropDown.selectByVisibleText("Employee");
		WebElement marketElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 	Select marketDropDown = new Select(marketElement);
	 	marketDropDown.selectByValue("9001");
	 	WebElement ownershipElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 	Select ownershipDropDown = new Select(ownershipElement);
	 	ownershipDropDown.selectByIndex(5);
	 	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("8765412345");	 	
	 	WebElement countryElement = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	 	Select countryDropDown = new Select(countryElement);
	 	countryDropDown.selectByVisibleText("India");
	 	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 	String Title = driver.getTitle();
	 	System.out.println("Resulting Page Title is " + Title);	 			
		driver.close();
	}

}
