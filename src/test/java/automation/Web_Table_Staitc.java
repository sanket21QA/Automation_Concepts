package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web_Table_Staitc {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
//		Locate table
		
		WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
		
//		no of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		System.out.println("no of rows = "+ rows.size());
//		no of columns
		
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
		
		System.out.println("no of columns = "+ columns.size());
		
		for(int r=2; r<rows.size(); r++)
		{
			for(int c=1; c<columns.size(); c++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']"
						+ "//tr["+r+"]//td["+c+"]")).getText());
				
				// to pass the dynamic value in xpath use syntax //tr["+r+"]    ****************************
			}
		}
		
		
		
	}

}
