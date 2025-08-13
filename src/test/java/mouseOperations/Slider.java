package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver d = new ChromeDriver();
		
		d.get("https://jqueryui.com/slider/#colorpicker");
		
		d.manage().window().maximize();
		
		Thread.sleep(3000);
		
		d.switchTo().frame(0);
		// to switch the control into the frame
		
		Thread.sleep(1000);
		
		WebElement sliderred = d.findElement(By.xpath("//div[@id='red']"));
		
        Actions act = new Actions(d);
        
        Thread.sleep(1000);
        
        act.clickAndHold(sliderred).moveByOffset(-50, 0).release().build().perform();
        
		WebElement slidergreen = d.findElement(By.xpath("//div[@id='green']"));
		
		act.clickAndHold(slidergreen).moveByOffset(10, 0).release().build().perform();
		
		
		
		WebElement sliderblue = d.findElement(By.xpath("//div[@id='blue']"));
		
		act.dragAndDropBy(sliderblue, 100, 0).release().build().perform();
		      
        
    

	}

}
