package week4.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");

		//Which is your favourite automation tool?

		System.out.println("Which is your favourite automation tool?");
		WebElement toolEle = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select toolDD = new Select(toolEle);
		toolDD.selectByVisibleText("Selenium");


		//Select the country	
		System.out.println("Select the country");
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();

		//Confirm Cities belong to the country got selected  
		Thread.sleep(2000);
		System.out.println("City is selected");
		driver.findElement(By.id("j_idt87:city")).click();
		WebElement findCity1 = driver.findElement(By.xpath("//li[@data-label='Chennai']"));
		String city1 = findCity1.getText();
		findCity1.click();

		//Select the country	
		System.out.println("Select the country");
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[1]")).click();
		driver.findElement(By.id("j_idt87:country_2")).click();

		//Confirm Cities belong to the country got selected  
		Thread.sleep(2000);
		System.out.println("City is selected");
		driver.findElement(By.id("j_idt87:city")).click();
		WebElement findCity2 = driver.findElement(By.id("j_idt87:city_1"));
		String city2 = findCity2.getText();
		findCity2.click();

		//Choose the course
		System.out.println("Choose the course");		
		driver.findElement(By.xpath("//button[@role='button']")).click();
		driver.findElement(By.xpath("//li[@data-item-label='Appium']")).click();


		//Choose language randomly  -- partially completed
		System.out.println("Choose language randomly");
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Telugu']")).click();

		//	Choose 2 irrespectively
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_1")).click();
		driver.close();

	}

}
