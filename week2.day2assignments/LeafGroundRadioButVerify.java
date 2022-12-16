package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadioButVerify {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");

		//Your most favourite Browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();

		//UnSelectable
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();

		//find the default select radio button  - but returns false
		System.out.println("Is the default button is selected " + driver.findElement(By.xpath("//label[text()='Safari']")).isSelected());
		
		//select the age group not done

	}

}
