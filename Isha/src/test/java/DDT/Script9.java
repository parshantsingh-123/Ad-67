package DDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genriclib.Baseclass;
import pom.repo.Contact;

public class Script9 extends Baseclass{

	@Test
public void script() throws RuntimeException, IOException {
		Contact con=new Contact(driver);
	con.getContactlink().click();
	con.getCreatecontact().click();
	web.selectdropdownbyvalue(con.firstname, "Mr.");
	con.getLastname().sendKeys(ub.getdatafromexcelfile("contact", 0, 0));
	con.getSavebutton().click();;
}
	
	

}
