package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uplaod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.expandtesting.com/upload");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement chose = driver.findElement(By.id("fileInput"));
		
		chose.sendKeys("C:\\Users\\salok\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-03-11 161707.png");
		
		Thread.sleep(5000);
		
		WebElement upload = driver.findElement(By.id("fileSubmit"));
		
		upload.click();
		
		WebElement display = driver.findElement(By.xpath("//h1[text()='File Uploaded!']"));
		
		System.out.println(display.isDisplayed());
		
		

	}

}
