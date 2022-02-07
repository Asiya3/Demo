package Com.Generic_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	     WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\selenium\\LoginInfo\\acti_Login.txt");
		
		
		Properties pobj=new Properties();
		
		pobj.load(fis);
		
		String url=pobj.getProperty("url");
		String username=pobj.getProperty("username");
		
		String password=pobj.getProperty("password");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
		driver.get(url);
		
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		
		
		  FileInputStream fs1=new FileInputStream("./src/test/resources/Book1.xlsx");
		  
		  
		  Workbook book=WorkbookFactory.create(fs1);
		  
		  Sheet sh=book.getSheet("Sheet1");
		  
		  Row r=sh.getRow(1);
		  
		  Cell cl=r.getCell(1);
		  
		  String str=cl.getStringCellValue();
		  
		  driver.findElement(By.id("taskSearchControl_field")).sendKeys(str);
		  
		 
	}

}
