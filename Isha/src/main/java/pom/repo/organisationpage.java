package pom.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationpage {
	public organisationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Organizations")
	private WebElement organisationlink;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createorganisation;
	@FindBy(name ="accountname")
	private WebElement name;
	@FindBy(name="industry")
	private WebElement industry;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	public WebElement getOrganisationlink() {
		return organisationlink;
	}
	public WebElement getCreateorganisation() {
		return createorganisation;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getIndustry() {
		return industry;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}

}
