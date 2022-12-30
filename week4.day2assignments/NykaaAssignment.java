package week4.day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NykaaAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.nykaa.com/");	
		
		
//		to do mouse hover on brands
		WebElement brandEle = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brandEle).perform();	
		
		driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[1]")).click();
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("The title contains L'Oreal Paris");
		}
		else
		{
			System.out.println("The title does not contain L'Oreal Paris");
		}
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();		
		driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();
		driver.findElement(By.id("first-filter")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();		
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		
		String filter1 = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();		
		String filter2 = driver.findElement(By.xpath("(//span[@class='filter-value'])[2]")).getText();		
		
		if(filter1.equals("Shampoo"))
		{
			System.out.println("The first filter applied is "+ filter1);
		}
		
		
		if(filter2.equals("Color Protection"))
		{
			System.out.println("The first filter applied is "+ filter2);
		}
		
		driver.findElement(By.xpath("//div[contains(text(), 'Paris Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		WebElement sizeElement = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select sizeDD = new Select(sizeElement);
		sizeDD.selectByVisibleText("175ml"); 
		
//		print MRP of the product
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("The MRP of the product is " + price);
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frameElement);
//		print grand total
		String grandTotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("The Grand Total is " + grandTotal);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		System.out.println("The proceed button is clicked.");
		driver.switchTo().defaultContent();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handles2.get(1));		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']")).click();
		
//		check final price is equal to grand total
		String priceDetail = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();
		
		if(priceDetail.equals(grandTotal))
		{
			System.out.println("The final price is equal to Grand Total " + priceDetail);
			
		}
		driver.close();

	}

}
