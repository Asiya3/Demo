package Com.Generic_class;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Bace3 {
	public static void main(String[]args) {
		FileInputStream fis = new FileInputStream("url https://demo.actitime.com/login.do");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		System.setProperty("webdriver.chrome.driver","url https://demo.actitime.com/login.do");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name(".password")).sendKeys(password,Keys.ENTER);
		FileInputStream fis1 =new FileInputStream("url https://demo.actitime.com/login.do");
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet("Sheet1");
		Row ro=sh.getRow(1);
		Cell ce=ro.getCell(1);
		System.out.println(url);
		driver.findElement(By.id("tasksearchControl-field")).sendKeys(url);
		}

}
