package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUIPathACME {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");

		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		String pageTitle =	driver.getTitle();
		System.out.println("The current page title is " + pageTitle);
		driver.findElement(By.partialLinkText("Log Out")).click();
		driver.close();
	}

}
