package automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.net.UrlEscapers;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		
		d.get("no URL");
		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> web = d.findElements(By.tagName("a"));
		
		for(WebElement w:web)
		{
			String href = w.getAttribute("href");
			
			if(href==null || href.isEmpty())
			{
				System.out.println("connection check not possible");
				continue;
			}
			try
			{
				URL link = new URL(href);
				
				HttpURLConnection conn = (HttpURLConnection) link.openConnection();
				
				conn.connect();
				
				if (conn.getResponseCode()>400)
				{
					System.out.println("broken link");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
