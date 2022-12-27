package week4.day1Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBuyValue {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		driver.findElement(By.id("product-7593226699011")).click();


		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@aria-label=\"Dismiss\"]")).click();
		driver.switchTo().defaultContent();

		WebElement zipElement = driver.findElement(By.name("wk_zipcode"));
		zipElement.sendKeys("600096");
		zipElement.sendKeys(Keys.TAB, Keys.ENTER);

		driver.findElement(By.id("product-add-to-cart")).click();
		
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("agree")).click();	
		driver.close();


	}

}
