package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();		

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Selenium");
		driver.findElement(By.id("lastNameField")).sendKeys("Tester11");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("To create sample ui test cases");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("seleniumtester@teastleaf.com");
		WebElement stateElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDropDown = new Select(stateElement);
		stateDropDown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is a very important note.");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		driver.close();







	}

}
