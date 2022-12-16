package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBoxVerify {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/checkbox.xhtml");

		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		//Notification  - partially done
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();


		//	Chose your favourite language
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();

		//TriState TextBox - Not Done


		//	Toggle Switch
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt100'])/div[2]")).click();

		//  Verify if the checkbox is enabled
		System.out.println(driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']")).isEnabled());

		//		Select Multiple  - Not able to do multiple select

		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Miami");
		driver.findElement(By.xpath("//label[@for='ef201776-8494-4003-b164-3a0d369f4795']")).click();





	}

}
