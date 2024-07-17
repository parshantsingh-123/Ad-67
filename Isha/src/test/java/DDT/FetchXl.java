package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchXl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream se=new FileInputStream("./src/test/resources/xlx.xlsx");
 Workbook we = WorkbookFactory.create(se);
          Sheet sh = we.getSheet("Sheet1");
         int lstrow = sh.getPhysicalNumberOfRows();
        int lstcel = sh.getRow(0).getPhysicalNumberOfCells();
        
        for (int i=0;i<lstrow;i++) {
        	
        	for ( int j=0;j<lstcel;j++) {
        		
        		 Cell pu = sh.getRow(i).getCell(j);
        		 DataFormatter data=new DataFormatter();
        		 
        		System.out.print(data.formatCellValue(pu));
        	}
        }
	}

}
