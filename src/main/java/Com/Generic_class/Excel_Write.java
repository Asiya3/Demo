package Com.Generic_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Write {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
		
		FileInputStream fo=new FileInputStream("C:\\selenium\\MavenProject\\Book1.xlsx");
		
		
		Workbook wb=WorkbookFactory.create(fo);
		
		Sheet sh=wb.createSheet("Sheet2");
					
	sh.createRow(3).createCell(9).setCellValue("Bakrid");
	
	
	FileOutputStream Fos=new FileOutputStream("C:\\selenium\\MavenProject\\Book1.xlsx");
	
	wb.write(Fos);
	
	}

}
