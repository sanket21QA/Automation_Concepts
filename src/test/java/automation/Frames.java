package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

//		switch to frame **

		driver.switchTo().frame(0);

		WebElement f1 = driver.findElement(By.name("mytext1"));

		f1.sendKeys("aaaaa");

//		back to default frame mandatory then switch to another frame

		driver.switchTo().defaultContent();

//		switch to another frame

		driver.switchTo().frame(1);

		WebElement f2 = driver.findElement(By.name("mytext2"));

		f2.sendKeys("bbbb");
		
//		back to default frame mandatory then switch to another frame

		driver.switchTo().defaultContent();

//		switch to another frame

		driver.switchTo().frame(2);
		
//		then again inside // nested frame 
		
		driver.switchTo().frame(0);
		
		WebElement hi = driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']"));
		
		hi.click();
		
		WebElement webTest = driver.findElement(By.id("i21"));
		
		webTest.click();
		
		
//		WebElement loopselect = driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']"));
//		
//		loopselect.click();
//		
//		WebElement yes = driver.findElement(By.xpath("(//div[@class='MocG8c HZ3kWc mhLiyf OIC90c LMgvRb'])[2]"));
//		
//		yes.click();
//		
//		loopselect.sendKeys(Keys.ARROW_DOWN);
//		
//		loopselect.sendKeys(Keys.ENTER);
		
		
//		Thread.sleep(2000);
//		
//		WebElement next = driver.findElement(By.xpath("//div[@class='uArJ5e UQuaGc YhQJj zo8FOc ctEux']"));
//		
//		next.click();
//		
		
		
		Thread.sleep(2000);
		
//		***** clear button not working  *************
		
		WebElement clear = driver.findElement(By.xpath("//span[contains(text(),'Clear form')]"));
		
		clear.click();
		
		

		


	}

}
