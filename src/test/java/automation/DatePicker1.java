package automation;

import java.time.Duration;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement box = driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		box.click();
		
		while(true)
		{
			String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Month displayMonth1 = Month.valueOf(displayMonth.toUpperCase());
			Month expectedMonth = Month.JANUARY;
			
			String displayYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			int displayYear1 = Integer.valueOf(displayYear);
			
			int expectedYear = 2024;
			
			
			if(expectedMonth.compareTo(displayMonth1)>0)
			{
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
			else if(expectedMonth.compareTo(displayMonth1)<0)
			{
				driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
			}
			else
			{
				break;
			}
		}
		

		driver.findElement(By.xpath("//a[text()=20]")).click();
	}

}
