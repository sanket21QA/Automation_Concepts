package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksList {

	public static void main(String[] args) {
		        
	    // Launch browser
	    WebDriver driver = new ChromeDriver();
	
	    // Open the webpage
	    driver.get("https://login.salesforce.com");  // Replace with your target URL
	
	    // Get all anchor (<a>) elements
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	    // Print the total number of links
	    System.out.println("Total links: " + allLinks.size());
	
	    // Print the href of each link
	    for (WebElement link : allLinks) {
	        String url = link.getAttribute("href");
	        System.out.println(url);
	    }
	
	    // Close browser
	        driver.quit();
	    }
	}


