package week4.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesExamples {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// duration seconds increased to 70, then only the elements are getting identified
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		// get to the outer frame first
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Sample Text");

		//	get to the nested inner frame 
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		WebElement animalEle = driver.findElement(By.id("animals"));
		Select animalDD = new Select(animalEle);
		animalDD.selectByVisibleText("Baby Cat");






	}

}
