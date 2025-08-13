package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();

		d.get("https://rahulshettyacademy.com/AutomationPractice/");

		d.manage().window().maximize();

		Thread.sleep(2000);
		
//		how to reach hover button on page

//		method 1 == Actions class
		
		Actions act = new Actions(d);
//							(pass-- driver object**)
		
		WebElement mouseHover = d.findElement(By.id("mousehover"));
		
		act.moveToElement(mouseHover).build().perform();
		
		Thread.sleep(2000);
		
//		1.	click on top ***
		
//		d.findElement(By.xpath("//a[@href='#top']")).click();
		
//		2.	click on option reload *** --- xpath -- when almost no attribute present
		
		d.findElement(By.xpath("//a[text()='Reload']")).click();
		
		
		
		

	}

}
