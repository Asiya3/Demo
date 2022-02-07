import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
		  driver.get("https://demo.actitime.com/login.do");
		  
		 driver.findElement(By.name("username")).sendKeys("asiyana");
		 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		 TakesScreenshot sh=(TakesScreenshot)driver;
		  
		  Thread.sleep(3000);
		  File scr=sh.getScreenshotAs(OutputType.FILE);
		  File dist=new File("C:\\selenium\\MavenProject\\Screenshot\\java.png");
		  
		  
		  Files.copy(scr,dist);
		  
		  
	}

}
