package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Trail {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		
		Row r=sh.getRow(1);
		Cell c = r.getCell(1);
		String str=c.getStringCellValue();
		
		System.out.println(str);
		
		
	}

}
