package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				
		WebDriver d = new ChromeDriver();
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> radiobuttons = d.findElements(By.xpath("//input[@name='radioButton']"));

				for(int i=0; i<radiobuttons.size(); i++)
				{
					radiobuttons.get(i).click();
					Thread.sleep(2000);
				}
	}

}
