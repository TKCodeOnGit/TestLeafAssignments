package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Facebook {

	
	
	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7654261988");
		driver.findElement(By.id("password_step_input")).sendKeys("HHRRR23&");		
	
		
		WebElement dayElement = driver.findElement(By.id("day"));
     	Select dayDropDown = new Select(dayElement);
     	dayDropDown.selectByVisibleText("7");
     	
     	WebElement monthElement = driver.findElement(By.id("month"));
     	Select monthDropDown = new Select(monthElement);
     	monthDropDown.selectByValue("5");
     	
     	WebElement yearElement = driver.findElement(By.id("year"));
     	Select yearDropDown = new Select(yearElement);
     	yearDropDown.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
		driver.close();
		
		

	}

}
