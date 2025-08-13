package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_picker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement dateBOX2 = driver.findElement(By.xpath("//input[@id='txtDate']"));
		
		dateBOX2.click();
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		
//		MONTH
		Select ss = new Select(month);
		
		ss.selectByVisibleText("Aug");
		
//		YEAR
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		Select yy = new Select(year);
		
		yy.selectByValue("2020");
		
//		DATE
		
		WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		
		System.out.println(date.getText());
		
		
		
		

	}

}
