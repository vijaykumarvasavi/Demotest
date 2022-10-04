package libraryfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfiledata {

	public String getdataexcelsheet (String sheetname, int rownum, int cellnum) throws Exception, Exception {
		// TODO Auto-generated method stub
		
		
		FileInputStream ec = new FileInputStream(Pathstorage.exceldata);
     	   Workbook book = WorkbookFactory.create(ec);
	        Sheet sheet = book.getSheet(sheetname);
             Row row = sheet.getRow(rownum);
         Cell cell = row.getCell(cellnum);
         String valuve = cell.getStringCellValue();
         return valuve;
         
                   
	}

}
