import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Generic_class.Properties_Excel_Fetching;

public class Real_FrameWork {
	
	
	WebDriver driver;
	 Properties_Excel_Fetching da=new Properties_Excel_Fetching();
     
	
	@BeforeClass
	
	public void open_URL() throws Throwable
	{
          
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get(da.Properties_Fetch("url"));
	}
	
	@BeforeMethod
	
	 public void login() throws Throwable
	 {
       driver.findElement(By.id("username")).sendKeys(da.Properties_Fetch("username"));
		
		driver.findElement(By.name("pwd")).sendKeys(da.Properties_Fetch("password"),Keys.ENTER);
		
		System.out.println(da.excel_Fetch("Sheet1", 1,1));
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(da.excel_Fetch("Sheet1", 1,1));
	 }
	
	@Test
	 public void tc1()
	 {
		 System.out.println("Tc1 is Running");
	 }
	 
		/*
		 * @Test public void tc2() { System.out.println("Tc2 Running"); }
		 */
	 @AfterMethod
	 
	 public void logout()
	 {
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
	 }
	 
	 @AfterClass
	 
	 public void closeBrowser()
	 {
		 System.out.println("Browser Closed");
	 }
	 
	
	
	
	

}
