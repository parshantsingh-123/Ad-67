package genriclib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.repo.loginpage;

public class Baseclass {
	public static WebDriver driver;
	public static Excelutil ub=new Excelutil();
	public static loginpage log=new loginpage(driver);
public static 	WebdriverUtil web=new WebdriverUtil();

	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("report generation",true);
		
	}
	@BeforeClass
	public void before() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ub.getdatafrompropertyfile("url"));
	}
	@BeforeMethod
	public void beforeMethod() throws IOException {
		log=new loginpage(driver);
		log.getUsername().sendKeys(ub.getdatafrompropertyfile("username"));
		log.getPassword().sendKeys(ub.getdatafrompropertyfile("password"));
		log.getLogin().click();
	}
	public void aftermethod() throws InterruptedException {
		log=new loginpage(driver);
		log.getAdmin().click();
		log.getSignout().click();
	}
	public void afterclass() {
		driver.close();
	}
	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

		
		
	}





