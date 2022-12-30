package week4.day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));

		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		String secondWindow = handles.get(1);

		//switch to window 2 and select first contaact
		driver.switchTo().window(secondWindow);		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		//back to window 1
		driver.switchTo().window(handles.get(0));				
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> secondHandles = new ArrayList<String>(windowHandles2);

		//		switch to window 2 of the second set up and select second contact
		driver.switchTo().window(secondHandles.get(1));				
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr[1]/td[1]")).click();
		
				
		driver.switchTo().window(secondHandles.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();		
		driver.switchTo().alert().accept();
		
//		After Merging, we are getting Transaction error. Because of that we are not able to proceed further.
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		
		

	}

}
