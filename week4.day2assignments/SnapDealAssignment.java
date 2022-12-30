package week4.day2assignments;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAssignment {

	public static void main(String[] args) throws Exception {

		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://www.snapdeal.com/");


		//		to do mouse hover on brands
		WebElement mensfashEle =driver.findElement(By.xpath("//span[contains(text(),'s Fashion')]"));
		Actions builder = new Actions(driver);		
		builder.moveToElement(mensfashEle).perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		//		get count of shoes
		String count = driver.findElement(By.xpath("(//div[contains(text(),'Sports Footwear')]/following::div[@class='child-cat-count '])[1]")).getText();
		System.out.println("Shoes count is "+ count);


		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();		
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();

		//to check the sort order of shoes  - Not sure whether this logic is right
		driver.navigate().refresh();
		
		
		
		java.util.List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		Set<Integer> priceSortOrder = new TreeSet<Integer>();
		for(WebElement eachEle :  priceElements)
		{
			String attribute = eachEle.getAttribute("display-price");				
			priceSortOrder.add(Integer.valueOf(attribute));
		}
		System.out.println("The order of shoe prices are from low to high " +  priceSortOrder);

		WebElement element2 = driver.findElement(By.name("fromVal"));
		Actions actions2 = new Actions(driver);
		actions2.scrollToElement(element2).perform();

		WebElement fromValue = driver.findElement(By.name("fromVal"));
		fromValue.clear();
		fromValue.sendKeys("900");	


		WebElement toValue = driver.findElement(By.name("toVal"));
		toValue.clear();
		toValue.sendKeys("1200");		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

		WebElement element = driver.findElement(By.xpath("//span[text()='Yes']"));
		Actions actions1 = new Actions(driver);
		actions1.scrollToElement(element).pause(Duration.ofSeconds(4)).click(element).perform();

		WebElement shoeElement = driver.findElement(By.xpath("//img[@title='Force 10 By Liberty Yellow Sports Shoes']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(shoeElement).perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  '] ")).click();
		Thread.sleep(2000);
		String cost = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']//span")).getText();
		
		System.out.println("The total cost of the shoe is " + cost);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount for the shoe is " + discount);	

		Thread.sleep(2000);
		//		to get the screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File ("./snap/ShoeSnapDetal.png");
		FileUtils.copyFile(source, target);

		Thread.sleep(2000);
		//close window

		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		
		Thread.sleep(2000);
		//		close main window
		driver.close();


	}

}
