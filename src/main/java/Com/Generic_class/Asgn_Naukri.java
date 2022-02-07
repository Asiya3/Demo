package Com.Generic_class;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asgn_Naukri {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");

		
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.naukri.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	WebElement ele=driver.findElement(By.xpath("//div[text()='Services']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(ele).perform();
	
 
	
	driver.findElement(By.xpath("//a[text()='Management courses']")).click();
	
	
	
	String mainWindow=driver.getWindowHandle();
	
	Set<String> subWindows=driver.getWindowHandles();
	
	
	
	for(String multi: subWindows)
	{
		
		if(!multi.equals(mainWindow))
		{
			
			driver.switchTo().window(multi);
			
		}
		
	}
	
	
	driver.findElement(By.xpath("(//a[@class='tag'])[8]")).click();
	
	driver.findElement(By.xpath("//span[text()='Beginner']")).click();
	
	
	String s=driver.findElement(By.xpath("//div[@class='tags-container']")).getText();
	
	
	System.out.println(s);
	
	
	
	}

}


