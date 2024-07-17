package listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

import genriclib.Baseclass;
import genriclib.IConstant;

public class listner extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("started",true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("fail",true);
		TakesScreenshot sc=(TakesScreenshot)driver; 
			File source = sc.getScreenshotAs(OutputType.FILE);
			File fl=new File(IConstant.screenshotpath);
			try {
				FileHandler.copy(source, fl);
			
			}
			catch(IOException e) {
				e.printStackTrace();
			
		
			
		};
	}

}
