package pom.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	public WebElement admin;
	@FindBy(linkText = "Sign Out")
	public WebElement signout;

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
}



