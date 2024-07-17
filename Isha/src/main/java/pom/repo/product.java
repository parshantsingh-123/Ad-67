package pom.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product {
	
	public product( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Products")
	private WebElement productlink;
	@FindBy( xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createproduct;
	@FindBy( name="productcategory")
	private WebElement productcatgory;

	public WebElement getProductlink() {
		return productlink;
	}
	 
	public WebElement getCreateproduct() {
		return createproduct;
	}
	public WebElement getProductcatgory() {
		return productcatgory;
	}
	

}
