package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException, IOException {


		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));		
		driver.get("https://dev57553.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("5$dJ*EFdhhW0");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(4000);

		driver.navigate().refresh();	
		driver.navigate().refresh();
		Thread.sleep(5000);

		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@id='all']").click();		

		shadow.findElementByXPath("//span[text()='Service Catalog']").click();		

		WebElement frameEle = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameEle);
		driver.findElement(By.xpath("(//a[@class='category_title_link'])[8]")).click();

		driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();

		WebElement colorElement = driver.findElement(By.id("IO:8350086e4f334200086eeed18110c7cd"));
		Select colorDD = new Select(colorElement);
		colorDD.selectByVisibleText("Gold");


		WebElement storagelement = driver.findElement(By.id("IO:32e0886e4f334200086eeed18110c738"));
		Select storeDD = new Select(storagelement);
		storeDD.selectByVisibleText("128");

		driver.findElement(By.id("oi_order_now_button")).click();
		Thread.sleep(2000);

		String orderSuccess = driver.findElement(By.xpath("//div[@class='notification notification-success']/span")).getText();
		System.out.println("Success message is "+ orderSuccess);

		String requestNo = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("The request no is " + requestNo);


		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File ("./snap/MobileOrderCopy.png");
		FileUtils.copyFile(source, target); 
		
		driver.quit();




	}

}
