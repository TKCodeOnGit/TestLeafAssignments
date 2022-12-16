package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonVerify {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/button.xhtml");

		//Click and confirm title
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		System.out.println("The title of the page is " + driver.getTitle());
		driver.navigate().back();

		//Confirm that button is disabled - Not sure
		//		boolean flag = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
		//		System.out.println("Is the button Enabled: " + flag);

		//Get the position of the button
		System.out.println("The position is "+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());


		//	Get the color of the button
		System.out.println("The color is " + driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
		
		//	Get the Height and Width
		System.out.println("The size of the button is " + driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
	}

}
