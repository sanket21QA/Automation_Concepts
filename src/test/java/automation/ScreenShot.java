package automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(3000);
		
//		TakeScreenShot is interface need to cast with driver
		
		TakesScreenshot sshot = (TakesScreenshot) driver;
		
		File source = sshot.getScreenshotAs(OutputType.FILE);
		
		File target = new File("D:\\Study\\DATA\\Testing\\SSquareit Class\\screenshot\\sc01.png");
		
		Files.copy(source, target);
		
//		Take screen shot of the particular webelement
		
		WebElement aa = driver.findElement(By.name("BookTable"));
		
		Thread.sleep(3000);
		
		File ss = aa.getScreenshotAs(OutputType.FILE);
		
		File tt = new File("D:\\Study\\DATA\\Testing\\SSquareit Class\\screenshot\\sc02.png");
		
		Files.copy(ss, tt);

//		if file name already exist it replace the file ***************
	} 
	

}
