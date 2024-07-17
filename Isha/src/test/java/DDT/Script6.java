package DDT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genriclib.Excelutil;
import genriclib.JavaUtil;
import genriclib.WebdriverUtil;
import pom.repo.loginpage;
import pom.repo.organisationpage;

public class Script6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
WebDriver driver=new ChromeDriver();
WebdriverUtil um=new WebdriverUtil();
Excelutil ub=new Excelutil();
um.maximizethewindow(driver);
driver.get(ub.getdatafrompropertyfile("url"));
loginpage log=new loginpage(driver);
log.getUsername().sendKeys(ub.getdatafrompropertyfile("username"));
log.getPassword().sendKeys(ub.getdatafrompropertyfile("password"));
log.getLogin().click();
organisationpage op=new organisationpage(driver);
op.getOrganisationlink().click();
op.getCreateorganisation().click();
JavaUtil lp=new JavaUtil();
 int io=lp.getRandomnumber();
op.getName().sendKeys(ub.getdatafromexcelfile("organisation", 0, 0)+io);
um.selectdropdownbyvalue(op.getIndustry(), "Healthcare");
op.getSavebutton().click();



	}

}
