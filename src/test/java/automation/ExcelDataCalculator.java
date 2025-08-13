package automation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelDataCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");

//		driver.manage().window().maximize();

		String filepath = System.getProperty("user.dir")+"\\testdata\\calculator.xlsx";
		
		int rows = ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			
//			Read data from excel
			
			String prin =  ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
			String rateofinterest =  ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
			String peroid1 =  ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
			String peroid2 =  ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
			String frequency =  ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
			String exp_maturity =  ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
			
//			pass the data in web application
			
			driver.findElement(By.id("principal")).sendKeys(prin);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(peroid1);
			Select prd2 = new Select(driver.findElement(By.id("tenurePeriod")));
			prd2.selectByVisibleText(peroid2);
			Select frq = new Select(driver.findElement(By.id("frequency")));
			frq.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			String act_value = driver.findElement(By.xpath("//div[@class='PR20 PT5']//span[2]")).getText();
			
			if (Double.parseDouble(exp_maturity)== Double.parseDouble(act_value))
			{
				System.err.println("Test passed");
				ExcelUtils.setCellData(filepath,"Sheet1",i,7,"Passed");
				ExcelUtils.fillGreenColor(filepath,"Sheet1",i,7);
			}
			else {
				System.err.println("Test Failed");
				ExcelUtils.setCellData(filepath,"Sheet1",i,7,"Failed");
				ExcelUtils.fillRedColor(filepath,"Sheet1",i,7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='MT10']//a[2]")).click();
			
		}
		
		driver.quit();
	}

}
