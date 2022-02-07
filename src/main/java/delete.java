import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin#drafts?projector=1");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("identifierId")).sendKeys("urmiladevip14@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
		
		
		
		
	}

}
