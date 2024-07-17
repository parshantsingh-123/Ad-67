package DDT;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@DataProvider
	public Object[][] datavalue(){
		Object[][]data=new Object[2][3];
		data[0][0]="spider";
		data[0][1]="aajaj";
		data[2][4]="kcxaskn";
		
		
	data[1][0]="mjhadk";
	data[1][1]="cwhjdj";
	data[1][2]="jkckjhk";
	return data;
		
	}
	@Test
	public void testcase ( Object name,Object email,Object phnno) {
		
		Reporter.log("hiiii");
	}

}
