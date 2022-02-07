package urmila;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");

		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://demo.actitime.com/login.do");
		  // driver.navigate().to("https://demo.actitime.com/login.do");
		   Thread.sleep(3000);
		   //driver.manage().window().maximize();
		  // Thread.sleep(3000);
		  // Dimension dm=new Dimension(200,300);
		   Point p=new Point(200, 300);
		   driver.manage().window().setPosition(p);
		   
		   Thread.sleep(2000);
		  // driver.manage().window().minimize();
		     String  value = driver.getTitle();
		      System.out.println(value);
		       String value1 =driver.getCurrentUrl();
		       System.out.println(value1);
		       String value2 =driver.getPageSource();
		       System.out.println(value2);
			   //driver.get("https://www.naukri.com/");
 
			   //driver.close();
			  // driver.quit();
			   
	}

}
