package week4.day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindowsHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver( );
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");

		System.out.println("Click and confirm new Window opens.");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handleList.get(1));
		System.out.println("The current page title is " + driver.getTitle());	
		driver.close();
		driver.switchTo().window(handleList.get(0));
		
		
		
		System.out.println("Find the Number of opened tabs.");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handleList2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handleList2.get(1));
		System.out.println("The first child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList2.get(2));
		System.out.println("The Second child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList2.get(0));
		
		
		System.out.println("Close All Windows except primary");
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> handleList3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(handleList3.get(1));
		System.out.println("The first child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList3.get(2));
		System.out.println("The Second child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList3.get(3));
		System.out.println("The Third child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList3.get(0));
		
		
		
		System.out.println("Wait for 2 new tabs to open");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> handleList4 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(handleList4.get(1));
		System.out.println("The first child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList4.get(2));
		System.out.println("The Second child window is " + driver.getTitle());
		driver.close();		
		driver.switchTo().window(handleList4.get(0));
		
		
	}

}
