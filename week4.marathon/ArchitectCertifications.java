package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		Shadow shadow = new Shadow(driver);

		WebElement learnEle = shadow.findElementByXPath("//span[text()='Learning']");
		learnEle.click();
		Thread.sleep(3000);

		WebElement hoveEle = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act = new Actions(driver);
		act.moveToElement(hoveEle).build().perform();
		Thread.sleep(3000);		
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handles2.get(1));

		driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();

		String textSummary = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']")).getText();
		System.out.println(textSummary);

		List<WebElement> availableCerts = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		List<String> certNames = new ArrayList<String>();


		for (int i = 0; i < availableCerts.size(); i++) {			
			certNames.add(availableCerts.get(i).getText());			
		}		

		System.out.println("List of SalesForce Architect certification " + certNames);
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();

		
		List<WebElement> availableCerts2 = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		List<String> certNames2 = new ArrayList<String>();

		for (int i = 0; i < availableCerts2.size(); i++) {			
			certNames2.add(availableCerts2.get(i).getText());			
		}		

		System.out.println("List of Application Architect Examination " + certNames2);
		
		WebElement certEle = driver.findElement(By.xpath("(//div[@class='credentials-card_title']//a)[4]"));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(certEle).pause(Duration.ofSeconds(3)).click().perform();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File ("./snap/Certificates.png");
		FileUtils.copyFile(source, target); 
		
		driver.quit();
	}

}
