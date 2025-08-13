package automation;

import java.awt.List;
import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
        
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        d.manage().window().maximize();
        
        Thread.sleep(3000);

//      Switch to another window *****
        
//        WebElement win = d.findElement(By.id("openwindow"));
//        
//        win.click();
//        
//        ArrayList<String> windows = new ArrayList<String>(d.getWindowHandles());
//        
//        String parentWindow = windows.get(0);
//        
//        String childWindow = windows.get(1);
//        
//        d.switchTo().window(childWindow);
//        
//        System.out.println(d.getCurrentUrl());
        
        
//      Switch to new tab *****
        
        WebElement tabs = d.findElement(By.id("opentab"));
        
        tabs.click();
        
        ArrayList<String> tabsUIN = new ArrayList<String>(d.getWindowHandles());
        
        String childTab = tabsUIN.get(1);
        
        d.switchTo().window(childTab);
        
        System.out.println(d.getCurrentUrl());
        
        
        
        
	}
}

