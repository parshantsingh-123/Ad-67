package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchingdatamap {

	public static void main(String[] args) throws IOException {
	FileInputStream fs=new FileInputStream("./src/test/resources/key.xlsx");
	Workbook ws = WorkbookFactory.create(fs);
	Sheet sh = ws.getSheet("Sheet1");
	int row=sh.getLastRowNum();

	LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
	for ( int i=0;i<=row;i++) {
		
		String key = sh.getRow(i).getCell(0).toString();
		String value = sh.getRow(i).getCell(1).toString();
		map.put(key, value);
		
		
		
	}
	for (Entry<String, String> m:map.entrySet()) {
		System.out.print(m.getKey()+ ":" +m.getValue());
	}
	
	
	 
	
	}

}
