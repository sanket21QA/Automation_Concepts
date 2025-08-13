package automation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_Table_Dynamic_Pagination {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Preferences map
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // Disable credential service
        prefs.put("profile.password_manager_enabled", false); // Disable password manager
//		-----------------------------------------------------------------------------------
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
        options.setExperimentalOption("prefs", prefs);

		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.clear();
		username.sendKeys("demoadmin");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.clear();
		password.sendKeys("demopass");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		login.click();
		
		WebElement customers = driver.findElement(By.id("menu-customer"));
		
		customers.click();
		
		WebElement customers1 = driver.findElement(By.xpath("//li[@id='menu-customer']//li[1]"));
		
		customers1.click();
		
		WebElement noPages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']"));
		
		String pages = noPages.getText();
		
		String noOFpages = pages.substring((pages.indexOf("(")+1), (pages.indexOf("Pages")-1)); 
//		
		int P = Integer.valueOf(noOFpages);
		
		System.out.println(P);
		
		
	}

}
