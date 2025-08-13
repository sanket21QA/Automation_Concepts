package automation;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeNotify {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless-new");
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--incognito");
		
		
		
	}
}
