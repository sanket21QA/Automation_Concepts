package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-se')]"));
		
		Actions act = new Actions(driver);
		
//		resize***
		
		act.clickAndHold(resize).moveByOffset(100, 150).release().build().perform();
//		OR
		act.dragAndDropBy(resize, -50, -75).release().build().perform();
		
	}

}
