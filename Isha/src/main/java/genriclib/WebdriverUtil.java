package genriclib;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtil {
		WebDriver driver;

	
	public static void maximizethewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
		public void refreshthepage(WebDriver driver) {
			driver.navigate().refresh();
		}
		
		public void forwardthepage(WebDriver driver) {
			
			driver.navigate().forward();
		}
		
		public void implicitlywait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		public void elementtobeclickwait(WebDriver driver, WebElement element) {
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		
		public void switchbacktoparentpage(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}
		
		
			public void switchtoframeint(WebDriver driver,int index) {
				driver.switchTo().frame(index);
			}
			
			
		
		public void switchbacktoparentpage(WebDriver driver) {
			
			driver.switchTo().parentFrame();
		}
		
		public void selectdropdownbyvalue(WebElement element, String value) {
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void acceptalert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		public void desmissalert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
			
		}
		
		public void clickonelement(WebElement element) {
			Actions ac=new Actions(driver);
			ac.click(element).perform();
		}
		
		public void doubleclick(WebElement element) {
			Actions ac=new Actions(driver);
			ac.doubleClick(element).perform();
			
		}
		public void contextclick( WebElement element) {
			Actions ac=new Actions(driver);
			ac.contextClick(element).perform();
		}
		
		public void scrollup(WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollby(0,-500);");
		}
		
		public void scrolldown( WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollby(0,500);");
		}
	}




