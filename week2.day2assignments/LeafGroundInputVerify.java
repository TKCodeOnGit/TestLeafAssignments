package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInputVerify {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/input.xhtml");

		//Type your Name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Kavitha T");

		//Append Country to this City
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys(", India");

		//Is disabled
		System.out.println("The element is enabled: " + driver.findElement(By.name("j_idt88:j_idt93")).isEnabled());  	

		//clear the typed text
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		//Retrieved the typed text.
		String value = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("The value retrieved is "+ value);

		//Type EMail and TAB
		WebElement emailElement = driver.findElement(By.id("j_idt88:j_idt99"));
		emailElement.sendKeys("kavitk@gmail.com");
		emailElement.sendKeys(Keys.TAB);


		//Type about yourself
		driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am a tester learning automation. I am a tester learning automation. I am a tester learning automation. I am a tester learning automation. I am a tester learning automation. ");

		// Text Editor
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("This is a text editor");

		//press enter and confirm error mesage
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String errorMessage = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		if(errorMessage.equals("Age is mandatory"))
		{
			System.out.println("The error message matches with the expected result.");
		}
		else
		{
			System.out.println("The error message DOES NOt matches.");
		}

		//Confirm Label Position change
		int oldXPos =	driver.findElement(By.xpath("//label[@for='j_idt106:float-input']")).getLocation().getX();
		System.out.println("The existing position of label is " + driver.findElement(By.xpath("//label[@for='j_idt106:float-input']")).getLocation());
		driver.findElement(By.id("j_idt106:float-input")).click();
		int newXPos = driver.findElement(By.xpath("//label[@for='j_idt106:float-input']")).getLocation().getX();
		System.out.println("The New position of label is " + driver.findElement(By.xpath("//label[@for='j_idt106:float-input']")).getLocation());
		if(oldXPos != newXPos)
		{
			System.out.println("The X position of the label is changed.");
		}
		else
		{
			System.out.println("The X position of the label is not changed.");
		}

		//Type your name and choose the third option
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("KavithaT");
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'][2]")).click();

		//Type your DOB and confirm  -- Unable to retrieve the test
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("7/10/2010");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")).click();
		Thread.sleep(2000);
		//		String DOB = driver.findElement(By.xpath("//span[@class='p-datepicker ui-calendar ui-trigger-calendar ui-inputwrapper-filled']")).getText();
		//		System.out.println(DOB);

		//Type number and spin to confirm change - Unable to retrieve the text here. But able to spin the number. But not able to assert it.
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("55");
		Thread.sleep(2000);		
		String input = driver.findElement(By.id("j_idt106:j_idt118_input")).getText();
		System.out.println("Input Value is " + input);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();

	}

}
