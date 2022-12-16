package week2.day1assginments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");		
	driver.manage().window().maximize();		

	driver.findElement(By.id("username")).sendKeys("democsr");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account 2021");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Selenium Local User");
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Selenium Testing Website");
	driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5500000");
	WebElement industryElement = driver.findElement(By.name("industryEnumId"));
 	Select industryDropDown = new Select(industryElement);
 	industryDropDown.selectByValue("IND_SOFTWARE");
 	WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
 	Select ownershipDropDown = new Select(ownershipElement);
 	ownershipDropDown.selectByVisibleText("S-Corporation");
 	WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
 	Select sourceDropDown = new Select(sourceElement);
 	sourceDropDown.selectByValue("LEAD_EMPLOYEE");
 	WebElement marketElement = driver.findElement(By.id("marketingCampaignId"));
 	Select marketDropDown = new Select(marketElement);
 	marketDropDown.selectByIndex(6);
 	WebElement stateElement = driver.findElement(By.name("generalStateProvinceGeoId"));
 	Select stateDropDown = new Select(stateElement);
 	stateDropDown.selectByValue("TX");
 	driver.findElement(By.xpath("//input[@value='Create Account']")).click(); 
 	driver.close();

	
}
	
	
}
