package pom.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	public Contact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Contacts")
	public WebElement contactlink;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	public WebElement createcontact;
	@FindBy(name = "salutationtype")
	public WebElement firstname;
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	public WebElement savebutton;
	public WebElement getContactlink() {
		return contactlink;
	}
	public WebElement getCreatecontact() {
		return createcontact;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	@FindBy(name = "lastname")
	public WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	
	}
	
}
