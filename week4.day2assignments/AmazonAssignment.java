package week4.day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 pro"+Keys.TAB);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		price of the first product
		
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();		
		System.out.println("The first phone price is " + price);
		Thread.sleep(1000);
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The average customer rating for the phone is " + rating);
		
		driver.findElement(By.xpath("//span[text()='OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage)']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/Oneplus10.png");
		FileUtils.copyFile(source, target);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handles2.get(1));
		
		
//		unable to get sub-total
		Thread.sleep(5000);
		String subtotal = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-price a-text-bold']//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		System.out.println("Subtotal is " + subtotal);
		
		
		
	
		
//		driver.close();
		
	}

}
