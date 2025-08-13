package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double__RightClick {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		1. DOUBLE CLICK ***
		
		WebElement dd = driver.findElement(By.id("dblclick"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(dd).build().perform();
		
		Thread.sleep(3000);
		
//		2. RIGHT CLICK ***
		
		WebElement rr = driver.findElement(By.id("rightclick"));
		
		act.contextClick(rr).build().perform();
		
		
	}

}
