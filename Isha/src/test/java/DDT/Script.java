package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

	public static void main(String[] args) throws IOException, InterruptedException {
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
    
    
    
    
	}

}
