package UrmilaSection2;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Move {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
      System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		
		Thread.sleep(3000);
		
	WebElement ele	=driver.findElement(By.xpath("//a[text()='Weather']"));
	   
	Action 
		
		
	}

}
