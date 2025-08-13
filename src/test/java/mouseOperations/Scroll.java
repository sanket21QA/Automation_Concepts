package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.jdi.connect.Connector.Argument;

//	methods
//	1. javascript
//		a. by pixel
//		b. by element
//		c. till bottom

//	2. actions class -- moveToELement

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		1. by pixel  ----------------------------------------
//
//		js.executeScript("window.scrollBy(0,1000)", "");
		
		
//		2. by element ---------------------------------------
//		
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
//		js.executeScript("arguments[0].scrollIntoView();", mouseHover);
		
//		3. till bottom ----------------------------------------
		
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
//		4.	Actions  ----------------------------------------------------
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mouseHover).build().perform();
		
		
		
		
	}

}
