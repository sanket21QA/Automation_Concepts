package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Keyboard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		driver.manage().window().maximize();

		Thread.sleep(3000);

//		auto suggestive drop down
		
		WebElement country = driver.findElement(By.id("autosuggest"));
//		
		country.sendKeys("ind");
		
		Thread.sleep(2000);
//		
		country.sendKeys(Keys.ARROW_DOWN);
//		
		country.sendKeys(Keys.ENTER);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("www.google.com");
		
		

	}

}
