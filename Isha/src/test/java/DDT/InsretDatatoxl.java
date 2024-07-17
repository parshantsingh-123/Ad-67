package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsretDatatoxl {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("./src/test/resources/xl.xlsx");
	Workbook ws = WorkbookFactory.create(fs);
		
	ws.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("automatic");
	FileOutputStream fr=new FileOutputStream("./src/test/resources/xl.xlsx");
	ws.write(fr);
	ws.close();

	}

}
