package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//		Locators ----->   HTML DOM
		
//		by --- id, name, className, tagName, linkText, partialText, cssSelector,  xPath
		
//		1.	ID **
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.click();
		
		username.sendKeys("abcd");           // enter text in the field          
		
//		2.	NAME **
		
		WebElement password = driver.findElement(By.name("pw"));
		
		password.click();
		
		password.sendKeys("abc@123");
		
		WebElement login = driver.findElement(By.name("Login"));
		
		login.click();
//		
//		3.	XPATH = //tagName[@attribute='value']
		
//		if no attribute available then = //tag[contains(text(), 'abcd']  
		
		WebElement errormessage = driver.findElement(By.xpath("// div[@id='error']"));
		
		boolean error_display = errormessage.isDisplayed();
		
		System.out.println(error_display);
		
		String error_msg = errormessage.getText();
		
		System.out.println(error_msg);
		
		
		
//		4.	linkText **
		
//		WebElement link = driver.findElement(By.linkText("Forgot Your Password?"));
//		
//		link.click();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
		
		
		
//		5. partialLinkText  -- type only few words from the  link
		
//		WebElement link2 = driver.findElement(By.partialLinkText("Use Custom"));
//		
//		link2.click();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//	
		
//		6. cssSelector   --- tagName[attribute='value']
		
		WebElement css = driver.findElement(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(		css.isDisplayed()	);
		
		System.out.println(		css.isEnabled()		);
		
		System.out.println(		css.isSelected()	);
		
		


	}

}
