package DDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genriclib.Baseclass;
import genriclib.JavaUtil;
import pom.repo.organisationpage;

public class Script8 extends Baseclass{
	
	
	@Test( groups = {"organisation"})
	public void script() throws RuntimeException, IOException {
		
		organisationpage op=new organisationpage(driver);
		
		op.getOrganisationlink().click();
		op.getCreateorganisation().click();
		JavaUtil lp=new JavaUtil();
		 int io=lp.getRandomnumber();
		op.getName().sendKeys(ub.getdatafromexcelfile("organisation", 0, 0)+io);
		web.selectdropdownbyvalue(op.getIndustry(), "Healthcare");
		op.getSavebutton().click();

	}

}
   