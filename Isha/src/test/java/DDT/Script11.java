package DDT;

import org.testng.annotations.Test;

import genriclib.Baseclass;
import pom.repo.Campaign;

public class Script11 extends Baseclass{
	
	@Test
	public void Script() {
		
		Campaign cam=new Campaign(driver);
	  cam.getMore().click();
	  cam.getCampaignlink().click();
	  cam.getCreatecampaign().click();
	  web.selectdropdownbyvalue(cam.campigntype, "Referral Program");
		
	}

}
