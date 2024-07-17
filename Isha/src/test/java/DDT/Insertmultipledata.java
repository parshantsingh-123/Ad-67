package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insertmultipledata {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("./src/test/resources/new.xlsx");
		Workbook ws = WorkbookFactory.create(fs);
		
                Sheet dr = ws.getSheet("Sheet1");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().fullscreen();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		for ( int i=0;i<links.size();i++) {
			Cell cell = ws.getSheet("Sheet1").createRow(i).createCell(0);
			cell.setCellValue(links.get(i).getAttribute("href"));
			
		FileOutputStream fd =new FileOutputStream("./src/test/resources/new.xlsx");
		ws.write(fd);
		ws.close();
		System.out.print("dataentered");
		}
		



}
}