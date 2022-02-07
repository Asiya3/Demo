package UrmilaSection2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Attributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method s
		
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(3000);
	     List<WebElement> ele=driver.findElements(By.xpath("//span"));
		                               Thread.sleep(3000);
		                             
		                               
		                               for(WebElement i :ele)
		                               {
		                            	   
		                            	   String strl=i.getText();
		                            	   
		                            	   System.out.println(strl);
		                            	   
		                               }
		                             
	}

}
