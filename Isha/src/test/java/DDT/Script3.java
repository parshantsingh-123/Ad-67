package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script3 {

	public static void main(String[] args) throws IOException, InterruptedException  {
FileInputStream fs=new FileInputStream("./src/test/resources/vtiger.properties");
		
		Properties ps=new Properties();
		ps.load(fs);

		String url = ps.getProperty("url");
		String usertext = ps.getProperty("username");
		    String pswtext = ps.getProperty("password");
		    
		    
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().fullscreen();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get(url);
		    driver.findElement(By.name("user_name")).sendKeys(usertext);
		    driver.findElement(By.name("user_password")).sendKeys(pswtext);
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.linkText("Organizations")).click();
		    
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    Random rownum= new Random();
		   int num = rownum.nextInt();
		    FileInputStream fl=new FileInputStream("./src/test/resources/vtiger.xlsx");
		 Workbook ws = WorkbookFactory.create(fl);
		String data = ws.getSheet("organisation").getRow(0).getCell(0).getStringCellValue()+num;
		 
		 Thread.sleep(1000);
		 driver.findElement(By.name("accountname")).sendKeys(data);
		WebElement dropdown = driver.findElement(By.name("industry"));
	Select st=new Select(dropdown);
	st.selectByValue("Healthcare");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
		 
		

	}

}
