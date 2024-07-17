package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertdataUsingMap {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("./src/test/resources/map.xlsx");
Workbook ws = WorkbookFactory.create(fs);
           Sheet sh = ws.getSheet("Sheet1");
           LinkedHashMap<String, String>map=new LinkedHashMap<String, String>();
           map.put("wsdf", "ghterd");
           map.put("jdbdb", "jssnsb");
           
           int rowNo=0;
        		   for (Entry<String, String> m:map.entrySet()) {
        			Row row =sh.createRow(rowNo++);
        			row.createCell(0).setCellValue((String)m.getKey());
        			row.createCell(1).setCellValue((String)m.getValue());
        			
        			   
        			   
        		   }
        		   
        		   
        		   FileOutputStream fl=new FileOutputStream("./src/test/resources/map.xlsx");
        			ws.write(fl);
        			ws.close();
        			 System.out.print(" Dta is entered");
        			   
	}
	
	
	

}
