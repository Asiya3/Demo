package urmila;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class forward1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();


	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();

		Navigation nav=driver.navigate();
		nav.back();
		
		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);

		nav.back();
		Thread.sleep(2000);

		nav.back();
		
		}

}
