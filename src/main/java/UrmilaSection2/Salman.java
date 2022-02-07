package UrmilaSection2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salman {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("q")).sendKeys("iphone");
	  
		Thread.sleep(2000);
	    List<WebElement> ele=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    Thread.sleep(3000);
	    for(WebElement i :ele)
	    {
	    	String str=i.getText();
	    	
			
			  if(str.contains("12"))
			  
			  { 
				  i.click(); 
			  }
	
	    	
	    	System.out.println(str);
	    	
	    }
	    
		
	}

}
