import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Framework {

	
	@BeforeClass
	public void open_URL()
	{
		System.out.println("URL Opened");
	}
	@BeforeMethod
	
	 public void login()
	 {
		 System.out.println("Login");
	 }
	 @Test
	 public void tc1()
	 {
		 System.out.println("Tc1 is Running");
	 }
	 
	 @Test
	 public void tc2()
	 {
		 System.out.println("Tc2 Running");
	 }
	 @AfterMethod
	 
	 public void logout()
	 {
		 System.out.println("Logout Running");
	 }
	 
	 @AfterClass
	 
	 public void closeBrowser()
	 {
		 System.out.println("Browser Closed");
	 }
	 
	 
	 
	 
}
