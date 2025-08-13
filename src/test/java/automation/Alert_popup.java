package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement aa = d.findElement(By.id("alertbtn"));
		
		aa.click();
		
		Thread.sleep(2000);
		
//		d.switchTo().alert().accept();
		
		d.switchTo().alert().dismiss();
		
//		Second Way
		
//		Alert myalert = d.switchTo().alert();
//		
//		myalert.accept();
		
		
//		not need get out of alert -- can directly operate the main page
		
		WebElement bb = d.findElement(By.id("checkBoxOption1"));
		
		bb.click();
		
		
		

	}

}
