package genriclibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellib {
	
	public static String readStringData(String sheetName, int row, int col) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./src/main/resources/resources/DemoWebShop.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet("Sheet2").getRow(0).getCell(1).toString();
	}
}
 


