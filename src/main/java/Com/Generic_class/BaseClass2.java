package Com.Generic_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass2 {
              
	
	WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		Properties_Excel_Fetching da=new Properties_Excel_Fetching();
           
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get(da.Properties_Fetch("url"));
		
		driver.findElement(By.id("username")).sendKeys(da.Properties_Fetch("username"));
		
		driver.findElement(By.name("pwd")).sendKeys(da.Properties_Fetch("password"),Keys.ENTER);
		
		System.out.println(da.excel_Fetch("Sheet1", 1,1));
		
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(da.excel_Fetch("Sheet1", 1, 1));
		
		
		
	}

}
