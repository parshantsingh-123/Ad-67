package DDT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genriclib.Excelutil;

public class Script7 {
	
	@Test(invocationCount = 2,threadPoolSize = 2)
	public void login() throws IOException {
		
		WebDriver driver= new ChromeDriver();
		Excelutil ex=new Excelutil();
		driver.get(ex.getdatafrompropertyfile("url"));
		
	}

}
