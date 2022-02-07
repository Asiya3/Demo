import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Generic_class.BaseTest;

public class Test_Case1 extends BaseTest {

	@Test
	public void tc1() throws Throwable, IOException   
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(da.excel_Fetch("Sheet1", 1,1));
	}
	
}
