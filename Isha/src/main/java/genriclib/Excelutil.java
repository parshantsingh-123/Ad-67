package genriclib;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class Excelutil {

	public	String getdatafrompropertyfile(String key)throws IOException {
			FileInputStream fs=new FileInputStream(IConstant.propertyfilepath);
			
			Properties ps=new Properties();
			ps.load(fs);
			return ps.getProperty(key);
			    
			
			
		

	}
public String getdatafromexcelfile(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
	FileInputStream fl=new FileInputStream(IConstant.xlfilepath);
	Workbook ws = WorkbookFactory.create(fl);
	Cell data = ws.getSheet(sheetname).getRow(rownum).getCell(colnum);
	DataFormatter fo=new  DataFormatter();
	return fo.formatCellValue(data);
	
	
}

public static String getCurrentTime() {
	 LocalDateTime datetime = LocalDateTime.now();
	String date=datetime.toString().replace(":", "-");
	return date;
}
}
