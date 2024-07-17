package pom.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign {
	
	
	public Campaign( WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@href='javascript:;']")
	private WebElement more;
	@FindBy(linkText = "Campaigns")
	private WebElement campaignlink;
	@FindBy( xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcampaign;

	public WebElement getCreatecampaign() {
		return createcampaign;
	}
	@FindBy( name="campaigntype")
	public WebElement campigntype;
	
	



	public WebElement getCampaignlink() {
		return campaignlink;
	}

	

	public WebElement getMore() {
		return more;
	}


	
	
}
