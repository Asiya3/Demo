package Com.Generic_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Properties_Excel_Fetching {

	
	public String Properties_Fetch(String Key) throws Throwable
	{
		
		FileInputStream fis=new FileInputStream("C:\\selenium\\LoginInfo\\acti_Login.txt");
		
		Properties pobj=new Properties();
		
		pobj.load(fis);
		
		String url=pobj.getProperty(Key);
		
		return url;
		
	}
		
	
	public String excel_Fetch(String sheet_Name,int row_num,int cell_Num) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis1=new FileInputStream("./src/test/resources/Book1.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis1);
		
		Sheet sh=wb.getSheet(sheet_Name);
		Row ro=sh.getRow(cell_Num);
		Cell ce=ro.getCell(cell_Num);
		String str=ce.getStringCellValue();
		
		return str;
		
		
	}
		
	

}
