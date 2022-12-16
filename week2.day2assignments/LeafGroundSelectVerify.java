package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelectVerify {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");

		//Which is your favourite automation tool?

		Thread.sleep(2000);
		WebElement toolEle = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select toolDD = new Select(toolEle);
		toolDD.selectByVisibleText("Selenium");


		//Select the country
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();

		//Confirm Cities belong to the country got selected  - Not Done

		
		//Choose the course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@role='button']")).click();
		driver.findElement(By.xpath("//li[@data-item-label='Appium']")).click();

		//		

		//Choose language randomly  -- partially completed
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[3]")).click();

	}

}
