package DDT;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genriclib.Baseclass;
import listners.listner;
import pom.repo.Campaign;
@Listeners(listner.class)
public class Script99 extends Baseclass{
	
	@Test( groups = {"organisation"})
	public void Script() {
		
		Campaign cam=new Campaign(driver);
	  cam.getMore().click();
	  cam.getCampaignlink().click();
	  cam.getCreatecampaign().click();
	  web.selectdropdownbyvalue(cam.campigntype, "Referral Program");
		
	}

}
