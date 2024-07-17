package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datautility {

	public static void main(String[] args) throws IOException {
	FileInputStream fis =new FileInputStream("./src/test/resources/prop.properties");
Properties prop=new Properties();
prop.load(fis);
String url = prop.getProperty("url");
WebDriver driver= new ChromeDriver();
driver.manage().window().fullscreen();
driver.get(url);

	
	}

}
