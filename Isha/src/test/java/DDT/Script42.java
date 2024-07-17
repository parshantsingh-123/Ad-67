package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script42 {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		    driver.findElement(By.linkText("Contacts")).click();
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    Thread.sleep(2000);
		    FileInputStream fl=new FileInputStream("./src/test/resources/vtiger.xlsx");
		    Workbook ws = WorkbookFactory.create(fl);
			String data = ws.getSheet("contact").getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.name("lastname")).sendKeys(data);
			driver.findElement(By.xpath("//img [@src='themes/softed/images/select.gif']")).click();
		String parent = driver.getWindowHandle();
Set<String> win = driver.getWindowHandles();
win.remove(parent);
System.out.print(win);

for (String wer:win) {
	driver.switchTo().window(wer);
	WebElement drop = driver.findElement(By.name("search_field"));
	
Select sel=new Select(drop);
sel.selectByVisibleText("Organization Name");
driver.findElement(By.linkText("isha")).click();
break;
	}
driver.switchTo().window(parent);

driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		
}
	}


