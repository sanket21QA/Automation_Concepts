package mouseOperations;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		
//		Select class == use only when HTML DOM contains select tag name  *****
		
//		1. selectByIndex
//		2. selectByVisibleText
//		3. getOptions
		
		Select option = new Select(drop);
//							(pass-- web element**)
//		
//		1. by INDEX **
		
		option.selectByIndex(1);
		
		Thread.sleep(2000);
		
//		2. by VISIBLE TEXT **
		
		option.selectByVisibleText("Option2");
		
		Thread.sleep(2000);
//
//		below option can be use only when HTML DOM contains value attribute
		
		option.selectByValue("option3");
		
//		3. LIST OF OPTIONS **
		
		List<WebElement> oplist = option.getOptions();
		
		System.out.println(oplist.get(1).getText());
//										*****
		
	}

}
