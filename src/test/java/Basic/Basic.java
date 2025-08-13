package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		String URL = driver.getCurrentUrl();
		
		System.out.println(URL);
		
//		unique identification no of visiting browser page
		
		String UIN = driver.getWindowHandle();
		
		System.out.println(UIN);
	
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
//		driver.close();   // only single tab
		
		driver.quit();     // close all windows and tabs
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
